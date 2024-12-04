/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.xtec.ioc.controller;

/**
 *
 * @author victor
 */


import cat.xtec.ioc.service.MedicamentService;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/medicaments")
public class MedicamentController {
    
    @Autowired
    private MedicamentService medicamentService;
    
    @RequestMapping("/all")
    public ModelAndView allMedicaments(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException{
        ModelAndView modelview = new ModelAndView("medicaments");
        
        modelview.getModelMap().addAttribute("medicaments", medicamentService.getAllMedicaments());
        return modelview;
    }
    
    @RequestMapping("/{category}")
    public ModelAndView getMedicamentsByCategory(@PathVariable("category") String medicamentCategory,
            HttpServletRequest request, HttpServletResponse response){
        ModelAndView modelview = new ModelAndView("medicaments");
        modelview.getModelMap().addAttribute("medicaments", 
                medicamentService.getMedicamentsByCategory(medicamentCategory));
        return modelview;
    }
}
