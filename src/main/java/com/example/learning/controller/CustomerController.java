package com.example.learning.controller;

import com.example.learning.model.Customer;
import com.example.learning.repository.CustomerRepository;
import com.example.learning.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {
    @Autowired
    CustomerService customerService;

    @Autowired
    CustomerRepository customerRepository;

    @PostMapping("/create")
    public String create(@RequestBody Customer customer) {
        // save a single Customer
        customerService.save(new Customer(customer.getFirstName(), customer.getLastName()));

        return "Customer is created";
    }
    @GetMapping("/customers")
    public List<Customer> findCustomers()
    {
        List<Customer> customers = customerService.finalAll();

        return customers;
    }

//    @RequestMapping(method = RequestMethod.GET)
//    ModelAndView home() {
//        ModelAndView modelAndView = new ModelAndView("customer");
//        modelAndView.addObject("customers", customerService.getCustomer());
//        return modelAndView;
//    }
//
//    @RequestMapping(value = "customer", method = RequestMethod.POST, consumes = MediaType.ALL_VALUE)
//    @ResponseStatus(value = HttpStatus.OK)
//    ModelAndView addCustomer(@RequestParam long id, @RequestParam String firstName, @RequestParam String lastName) {
//        ModelAndView modelAndView = new ModelAndView("customer");
//        try {
//            Customer customer = new Customer();
//            customer.setFirstName(firstName);
//            customer.setLastName(lastName);
//            customer = customerService.addCustomer(customer);
//            modelAndView.addObject("message", "Customer added with name: " + customer.getFirstName());
//        } catch (Exception exception) {
//            modelAndView.addObject("message", "Failed to add " + exception.getMessage());
//        }
//        modelAndView.addObject("customers", customerService.getCustomer());
//        return modelAndView;
//    }
}
