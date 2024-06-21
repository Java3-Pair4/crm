package com.pair4crm.productservice.services.concretes;

import com.pair4crm.productservice.clients.OrderServiceClient;
import com.pair4crm.productservice.dtos.requests.AddProdCharAndAddressRequest;
import com.pair4crm.productservice.dtos.requests.AddProdCharRequest;
import com.pair4crm.productservice.dtos.requests.AddServiceAddressRequest;
import com.pair4crm.productservice.dtos.responses.ProductConfigurationResponse;
import com.pair4crm.productservice.dtos.responses.getShowResponse;
import com.pair4crm.productservice.dtos.responses.getSubmitDetayResponse;
import com.pair4crm.productservice.entities.Product;
import com.pair4crm.productservice.repositories.ProductRepository;
import com.pair4crm.productservice.services.abstracts.ProductConfigurationService;
import com.pair4crm.productservice.services.mappers.ProductMapper;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class ProductConfigurationServiceImpl implements ProductConfigurationService {

    private final ProductRepository productRepository;
    private final OrderServiceClient orderServiceClient;
   // private final ProductMapper productMapper;


    public ProductConfigurationServiceImpl(ProductRepository productRepository, OrderServiceClient orderServiceClient) {
        this.productRepository = productRepository;
        this.orderServiceClient = orderServiceClient;

    };
/*
     FR19-1.MADDE
    Product Configuration” ekranında kullanıcının seçtiği ürünler liste şeklinde ve
     ürünlerin karakteristik bilgileri ile
    birlikte gösterilecektir. Ürünlerin Prod ID ve Prod Name bilgileri sistem tarafından ekrana yazdırılacaktır.
     */

    @Override
    public ProductConfigurationResponse getProductConfiguration(int Id) {

        Optional<Product> product = Optional.ofNullable(productRepository.findById(Id));

        //db de product bulundu ise product id, name, karakteristik bilgilerini geri dön.


        int productId = product.get().getId();
        String productName = product.get().getName();
        String productChar = product.get().getProdChar();

        return new ProductConfigurationResponse(productId, productName, productChar);

    }



    //FR19-2.MADDE
    @Override
    public ProductConfigurationResponse addProdChar(int id, AddProdCharRequest request) {

        Product product = productRepository.findById(id);

       // Product product = optionalProduct;
        product.setProdChar(request.getProdChar());
        Product updatedProduct = productRepository.save(product);

        return getProductConfiguration(updatedProduct.getId());

}
//2.madde
    @Override
    public ProductConfigurationResponse addServiceAddress(int id, AddServiceAddressRequest request) {

        // Veritabanındaki product bulunur.
        Product product = productRepository.findById(id);

        // Gelen adresi mevcut adresler listesine ekler.
        product.addAddress(request.getAdress());

        // Güncellenmiş ürünü veritabanına kaydeder.
        Product updatedProduct = productRepository.save(product);

        // Güncellenmiş ürün konfigürasyonunu döner.
        return getProductConfiguration(updatedProduct.getId());

    }
//2.madde belirtilen alanda Default adresini görüntüleyebilecektir.(+)
    @Override
    public List<String> getServiceAddress(int id) {

        Product product = productRepository.findById(id);
        return product.getAddresses();

    }


    //FR19 4 madde
    @Override
    public void AddProdCharAndAddress(int id,  AddProdCharAndAddressRequest request) {


        //DB den gelen product
        Product product = productRepository.findById(id);
        //DB den gelen productın prodcharını requestden gelen bilgi ile değiştirildi.
        product.setProdChar(request.getProdChar());
        product.setAddresses(request.getAddresses());

        productRepository.save(product);


    }



    /*
    ⦁	Order ID
⦁	Order Items
⦁	Service Address
⦁	Total Amount
int getStockByProductId(@RequestParam int orderId, @RequestParam String items);
  int getItemsByOrderId(@RequestParam int orderId, @RequestParam String items);
     */

    @Override
    public getSubmitDetayResponse getSubmitDetal(int id) {

        Product product = productRepository.findById(id);
        List<String> adres = Collections.singletonList(String.valueOf(product.getAddresses()));



       // String item = orderServiceClient.getItems();
        int Id = orderServiceClient.getOrderId(id);
        String item = "net";



        //product.setAddresses(adres);

        getSubmitDetayResponse getsubmitDetayResponse = new getSubmitDetayResponse(Id, item, adres);

       return  getsubmitDetayResponse;
    }

    @Override
    public getShowResponse getShow(int id) {

        Product product = productRepository.findById(id);
        String prodChar = product.getProdChar();
        List<String> adres = product.getAddresses();

        getShowResponse getShowResponse = new getShowResponse(prodChar,adres);


        return getShowResponse;
    }

}