/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import static org.springframework.web.servlet.mvc.method.annotation.MvcUriComponentsBuilder.controller;

/**
 *
 * @author carlosantonio
 */
@Controller
public class controlador {
    
 @RequestMapping(value="/principal.htm",method=RequestMethod.GET)
       public String principal(HttpServletRequest req){
           
                return "principal";
       }
 @RequestMapping(value="/medicos.htm", method=RequestMethod.GET)
    public String medico(){
        return "Medicos";
    }
}
