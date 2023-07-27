/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.moldakowski.supply_search.printer;

import java.util.List;
import java.util.jar.Attributes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
        
}
