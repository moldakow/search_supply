/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.moldakowski.supply_search.printer;

import jakarta.servlet.http.HttpServletResponse;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 *
 * @author Marcin
 */
@Service
public class PrinterService {
      
    @Autowired
    PrinterRepository printerRepository;

    public List<PrinterDto> findAll() {
        List<PrinterDto> printerDtoList = new ArrayList<>();
        List<Printer> printerList = printerRepository.findAll();
        for (Printer printer : printerList) {
            PrinterDto printerDto = new PrinterDto(printer.getId(), printer.getName(), printer.getVendor());
            printerDtoList.add(printerDto);
        }
        return printerDtoList;
    }

 

    public void save(Printer printer) {
        printerRepository.save(printer);
}

    Object findById(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
