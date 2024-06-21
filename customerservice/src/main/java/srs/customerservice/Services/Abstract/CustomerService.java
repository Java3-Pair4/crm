package srs.customerservice.Services.Abstract;


import srs.customerservice.Entities.Customer;
import srs.customerservice.Services.DTOs.Request.AddCustomerRequest;
import srs.customerservice.Services.DTOs.Request.Customer.AddCustomerDemografikRequest;
import srs.customerservice.Services.DTOs.Request.Customer.UpdateCustomerRequest;
import srs.customerservice.Services.DTOs.Response.AddCustomerResponse;
import srs.customerservice.Services.DTOs.Response.getAddressResponse;
import srs.customerservice.Services.DTOs.Response.getContactResponse;


public interface CustomerService {
    //List<SearchCustomerResponse> search(SearchCustomerRequest request);
    AddCustomerResponse add(AddCustomerRequest request);

//kullanıcı müşteriye ait adres bilgilerini görüntüleyebilmelidir.
    getAddressResponse getAddress(int id);

//müşteriye ait iletişim bilgilerini görüntüleyebilmelidir.
    getContactResponse getContact(int id);

//Kullanıcı, Customer Info Update sayfasında aşağıdaki alanları güncelleyebilecektir
    Customer updateCustomer(int id, UpdateCustomerRequest request);

// Demografik bilgi ekleme
    void demografikAdd(AddCustomerDemografikRequest request);


}
