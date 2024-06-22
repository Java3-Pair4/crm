package com.turkcell.searchservice.Controller;

import com.turkcell.searchservice.Services.Abstract.SearchCustomerService;
import com.turkcell.searchservice.Services.Dto.Response.SearchCustomerResponse;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/searchcustomers")
@Validated
@AllArgsConstructor
public class SearchCustomerController {

   private final SearchCustomerService searchCustomerService;


    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<SearchCustomerResponse> search(
            @RequestParam(required = false) String customerId,
            @RequestParam(required = false) String nationalityId,
            @RequestParam(required = false) String accountNumber,
            @RequestParam(required = false) String firstName,
            @RequestParam(required = false) String lastName
    ) {
        return this.searchCustomerService.search( customerId, nationalityId, accountNumber, firstName, lastName);
    }

    @GetMapping("/getAll")
    @ResponseStatus(HttpStatus.OK)
    public List<SearchCustomerResponse> getAll(){
        return this.searchCustomerService.getAll();
    }

}
