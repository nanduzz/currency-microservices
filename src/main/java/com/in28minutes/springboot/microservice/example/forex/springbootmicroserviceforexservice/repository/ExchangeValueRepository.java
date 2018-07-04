/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.in28minutes.springboot.microservice.example.forex.springbootmicroserviceforexservice.repository;

import com.in28minutes.springboot.microservice.example.forex.springbootmicroserviceforexservice.models.ExchangeValue;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author fernando
 */
public interface ExchangeValueRepository extends JpaRepository<ExchangeValue, Long>{
    
    ExchangeValue findByFromAndTo(String from, String to);
    
}
