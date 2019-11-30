/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tq.arxsoft.englishflashcard.controllers;

import tq.arxsoft.englishflashcard.logic.LessonManager;
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
        FlashCard qanswer = lessonManager.getFlashCard();
        model.addAttribute("showAnswer", "false");
        model.addAttribute("card", qanswer);
        return "QAPage";
    }
    
    @RequestMapping("/answer")
    public String answer(Model model) {
        FlashCard qanswer = lessonManager.getFlashCard();
        lessonManager.confirmFlashCard();
        model.addAttribute("card", qanswer);
        model.addAttribute("showAnswer", "true");
        return "QAPage";
    }
}
