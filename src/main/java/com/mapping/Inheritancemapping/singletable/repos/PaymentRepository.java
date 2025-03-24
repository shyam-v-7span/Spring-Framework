package com.mapping.Inheritancemapping.singletable.repos;

import com.mapping.Inheritancemapping.singletable.entities.Payment;
import org.springframework.data.repository.CrudRepository;

public interface PaymentRepository extends CrudRepository<Payment,Integer> {

}
