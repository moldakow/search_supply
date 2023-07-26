/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.moldakowski.supply_search.supply;

import com.moldakowski.supply_search.printer.Printer;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.util.List;

/**
 *
 * @author Marcin
 */
    @Entity
    public class Supply {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
  
    String original_name;
   
    List<String> alternativeNames;
   
    List<Printer> compatiblePrinters;
   
    String description;
    
}
