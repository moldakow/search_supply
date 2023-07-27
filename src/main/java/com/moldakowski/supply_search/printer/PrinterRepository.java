/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.moldakowski.supply_search.printer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Marcin
 */
///@Repository
@Repository
public interface PrinterRepository extends JpaRepository<Printer, Long> {
}
