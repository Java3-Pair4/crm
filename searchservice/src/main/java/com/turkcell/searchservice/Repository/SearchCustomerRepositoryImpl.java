package com.turkcell.searchservice.Repository;

import com.turkcell.searchservice.Entities.Customer;
import jakarta.persistence.EntityManager;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
public class SearchCustomerRepositoryImpl implements SearchCustomerRepository {

    private final FilterRepository filterRepository;



    private final EntityManager entityManager;


    @Override
    public List<Customer> searchResult(String customerId, String nationalityId , String accountNumber,  String firstName, String lastName) {
        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Customer> criteriaQuery = criteriaBuilder.createQuery(Customer.class);
        Root<Customer> root = criteriaQuery.from(Customer.class);

        List<Predicate> predicates = new ArrayList<>();

        if (customerId != null && !customerId.isEmpty()) {
            predicates.add(criteriaBuilder.like(criteriaBuilder.lower(root.get("customerId")), "%" + customerId.toLowerCase() + "%"));
        }
        if (nationalityId != null) {
            predicates.add(criteriaBuilder.equal(root.get("nationalityId"), nationalityId));
        }


        if (accountNumber != null) {
            predicates.add(criteriaBuilder.equal(root.get("accountNumber"), accountNumber));
        }

        if (firstName != null && !firstName.isEmpty()) {
            predicates.add(criteriaBuilder.like(criteriaBuilder.lower(root.get("firstName")), "%" + firstName.toLowerCase() + "%"));
        }

        if (lastName != null && !lastName.isEmpty()) {
            predicates.add(criteriaBuilder.like(criteriaBuilder.lower(root.get("lastName")), "%" + lastName.toLowerCase() + "%"));
        }


        // Filter out deleted records (assuming 'deletedDate' is a field in Customer)
        predicates.add(criteriaBuilder.isNull(root.get("deletedDate")));

        criteriaQuery.where(criteriaBuilder.and(predicates.toArray(new Predicate[0])));

        return entityManager.createQuery(criteriaQuery).getResultList();
    }
}
