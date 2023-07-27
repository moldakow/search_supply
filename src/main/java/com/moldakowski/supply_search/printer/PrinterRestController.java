/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.moldakowski.supply_search.printer;

import java.util.List;
import java.util.jar.Attributes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Marcin
 */
@RestController
@RequestMapping("printers")
public class PrinterRestController {

    @Autowired
    PrinterService printerService;

    @GetMapping("all")
    public List<PrinterDto> showAll(){
    return printerService.findAll();
    }
    
    @PutMapping("update/{id}")
    public ResponseEntity<Void> updatePrinter(@PathVariable Long id, @RequestBody Printer printer) {
        // jeżeli id istnieje w bazie danych
        if (printerService.findById(id) != null) {
//            printerService.save(printer);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.badRequest().build();
        }

    }

        
}
