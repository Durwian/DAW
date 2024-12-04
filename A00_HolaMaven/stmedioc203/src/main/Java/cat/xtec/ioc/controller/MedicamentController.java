/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.xtec.ioc.controller;

/**
 *
 * @author victor
 */

import cat.xtec.ioc.domain.repository.MedicamentRepository;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class MedicamentController {
    
    @Autowired
    private MedicamentRepository medicamentRepository;
    
    @RequestMapping(value= "/medicaments", method = RequestMethod.GET)
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException{
        ModelAndView modelview = new ModelAndView("medicaments");
        
        modelview.getModelMap().addAttribute("medicaments", medicamentRepository.getAllMedicaments());
        return modelview;
    }
}
