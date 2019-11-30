/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tq.arxsoft.englishflashcard.logic;

import tq.arxsoft.englishflashcard.dao.QADao;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import tq.arxsoft.englishflashcard.controllers.FlashCard;

/**
 *
 * @author tkudas
 */

@Component
public class LessonManager {
    
    @Autowired
    @Qualifier("fake")        
    QADao qadao;
    
    private List<FlashCard> qanwers = new ArrayList<>();
    
    public FlashCard getNextFlashCard() {
        if( qanwers.isEmpty() ) {
            qanwers = qadao.getAllFlashCardsForLesson(1);
        }
        return qanwers.get(0);
    }
    
}
