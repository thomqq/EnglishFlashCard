/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tq.arxsoft.englishflashcard.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author tkudas
 */

@Controller
public class QAController {
    
    @RequestMapping("/show")
    public String show(Model model) {
        model.addAttribute("question","DRZWI");
        return "QAPage";
    }
}
