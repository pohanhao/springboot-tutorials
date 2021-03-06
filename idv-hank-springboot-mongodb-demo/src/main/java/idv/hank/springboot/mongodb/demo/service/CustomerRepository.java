package idv.hank.springboot.mongodb.demo.service;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import idv.hank.springboot.mongodb.demo.model.Customer;

public interface CustomerRepository extends MongoRepository<Customer, String> {

	Customer findByFirstName(String firstName);

	List<Customer> findByLastName(String lastName);

}