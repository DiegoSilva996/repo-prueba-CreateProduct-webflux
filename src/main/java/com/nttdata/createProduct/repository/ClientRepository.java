package com.nttdata.createProduct.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.nttdata.createProduct.entity.Customer;

@Repository
public interface ClientRepository extends ReactiveMongoRepository<Customer, String>{

}
