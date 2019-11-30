/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tq.arxsoft.englishflashcard.controllers;

import java.util.List;

/**
 *
 * @author tkudas
 */
public interface QADao {
    List< QAnswer > getAllQAnwerForLesson(long id);
}
