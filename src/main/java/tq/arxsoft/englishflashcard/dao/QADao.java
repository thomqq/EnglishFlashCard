/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tq.arxsoft.englishflashcard.dao;

import java.util.List;
import tq.arxsoft.englishflashcard.controllers.FlashCard;

/**
 *
 * @author tkudas
 */
public interface QADao {
    List< FlashCard > getAllFlashCardsForLesson(long id);
}
