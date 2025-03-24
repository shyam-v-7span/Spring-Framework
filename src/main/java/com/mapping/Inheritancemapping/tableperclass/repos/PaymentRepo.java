package com.mapping.Inheritancemapping.tableperclass.repos;

import com.mapping.Inheritancemapping.tableperclass.entities.Payment;
import org.springframework.data.repository.CrudRepository;

public interface PaymentRepo extends CrudRepository<Payment,Integer> {

}
