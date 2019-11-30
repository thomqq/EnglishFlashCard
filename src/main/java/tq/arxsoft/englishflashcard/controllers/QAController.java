/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tq.arxsoft.englishflashcard.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author tkudas
 */

@Controller
public class QAController {
    
    @Autowired
    public LessonManager lessonManager;
    
    @RequestMapping("/show")
    public String show(Model model) {
        
       QAnswer qanswer = lessonManager.getNextQA();
        
        model.addAttribute("question",qanswer.getQuestion());
        return "QAPage";
    }
}
