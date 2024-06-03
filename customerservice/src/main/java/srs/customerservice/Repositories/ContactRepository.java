package srs.customerservice.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import srs.customerservice.Entities.Contact;

public interface ContactRepository extends JpaRepository<Contact,Long> {
}
