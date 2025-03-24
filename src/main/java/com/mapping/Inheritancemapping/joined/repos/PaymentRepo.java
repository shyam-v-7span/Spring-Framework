package com.mapping.Inheritancemapping.joined.repos;

import com.mapping.Inheritancemapping.joined.entities.Payment;
import org.springframework.data.repository.CrudRepository;

public interface PaymentRepo extends CrudRepository<Payment,Integer> {

}
