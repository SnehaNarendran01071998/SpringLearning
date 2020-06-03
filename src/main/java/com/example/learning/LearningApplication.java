package com.example.learning;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class LearningApplication {
    private static final Logger log = LoggerFactory.getLogger(LearningApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(LearningApplication.class, args);
    }

//    @Bean
//    public CommandLineRunner demo(CustomerRepository customerRepository) {
//        return (args) -> {
//            customerRepository.save(new Customer("Sneha", "Narendran"));
//            customerRepository.save(new Customer("Sachin", "Nair"));
//            customerRepository.save(new Customer("Sunanda", "Narayanakutty"));
//
//            log.info("All Customer Information: ");
//            for (Customer customer :
//                    customerRepository.findAll()) {
//                log.info(customer.toString());
//            }
//            log.info("_________________________________");
//            customerRepository.findByFirstName("Sneha").forEach(customer -> log.info(customer.toString()));
//
//        };
//    }
}
