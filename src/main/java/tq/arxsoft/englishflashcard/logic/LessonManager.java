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
    private int pos = -1;
    private boolean confirmCurrentFlashCard = false;

    private void initLesson() {
        qanwers = qadao.getAllFlashCardsForLesson(1);
        pos = -1;
        confirmCurrentFlashCard = true;
    }

    private FlashCard getNextFlashCard() {
        confirmCurrentFlashCard = false;
        return qanwers.get(++pos);
    }

    private FlashCard getCurrentFlashCard() {

        return qanwers.get(pos);
    }

    public FlashCard getFlashCard() {
        if (qanwers.isEmpty()) {
            initLesson();
        }
        if (confirmCurrentFlashCard) {
            return getNextFlashCard();
        } else {
            return getCurrentFlashCard();
        }
    }

    public void confirmFlashCard() {
        confirmCurrentFlashCard = true;
    }
}
