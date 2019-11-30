/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tq.arxsoft.englishflashcard.controllers;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 *
 * @author tkudas
 */

@Component
public class LessonManager {
    
    @Autowired
    @Qualifier("fake")        
    QADao qadao;
    
    private List<QAnswer> qanwers = new ArrayList<>();
    
    public QAnswer getNextQA() {
        if( qanwers.isEmpty() ) {
            qanwers = qadao.getAllQAnwerForLesson(1);
        }
        return qanwers.get(0);
    }
    
}
