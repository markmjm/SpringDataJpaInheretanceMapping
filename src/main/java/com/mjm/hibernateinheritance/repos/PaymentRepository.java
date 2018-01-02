package com.mjm.hibernateinheritance.repos;

import com.mjm.hibernateinheritance.entities.Payment;
import org.springframework.data.repository.CrudRepository;

public interface PaymentRepository extends CrudRepository<Payment, Integer>{
}
