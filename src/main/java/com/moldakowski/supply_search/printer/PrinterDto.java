/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.moldakowski.supply_search.printer;

import jakarta.persistence.Column;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Marcin
 */
public class PrinterDto {
    Long id;
    String name;
    String vendor;

    public PrinterDto(Long id, String name, String vendor) {
        this.id = id;
        this.name = name;
        this.vendor = vendor;
    }

      public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getVendor() {
        return vendor;
    }
    
    
       
    }
    
   
