/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.xtec.ioc.controller;

import cat.xtec.ioc.service.MovimentStockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Usuario
 */
@Controller
public class MovimentStockController {
    @Autowired
    private MovimentStockService movimentStockService;
    
    @RequestMapping("/movimentestoc/M020/2/-1")
    public String process(){
        movimentStockService.processMovimentStock("M020", 2, -1);
        return "redirect:/medicaments";
    }
}
