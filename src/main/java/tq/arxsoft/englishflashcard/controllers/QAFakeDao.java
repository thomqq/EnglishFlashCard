/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tq.arxsoft.englishflashcard.controllers;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;

/**
 *
 * @author tkudas
 */

@Component(value = "fake")
public class QAFakeDao implements QADao {

    @Override
    public List<QAnswer> getAllQAnwerForLesson(long id) {
       List< QAnswer > qanswers = new ArrayList<>();
       qanswers.add( new QAnswer("SŁOŃCE", "SUN"));
       return qanswers;
    }
    
}
