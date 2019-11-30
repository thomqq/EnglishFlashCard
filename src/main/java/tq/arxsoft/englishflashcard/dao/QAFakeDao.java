/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tq.arxsoft.englishflashcard.dao;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;
import tq.arxsoft.englishflashcard.controllers.FlashCard;

/**
 *
 * @author tkudas
 */

@Component(value = "fake")
public class QAFakeDao implements QADao {

    @Override
    public List<FlashCard> getAllFlashCardsForLesson(long id) {
       List< FlashCard > qanswers = new ArrayList<>();
       qanswers.add( new FlashCard("SŁOŃCE", "SUN"));
       qanswers.add( new FlashCard("DZRZWI", "DOOR"));
       return qanswers;
    }
    
}
