package com.spring.puzzle.others.transaction.example4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CardService {
    @Autowired
    private CardMapper cardMapper;

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    @DataSource(DataSource.card)
    public void createCard(int studentId) throws Exception {
        Card card = new Card();
        card.setStudentId(studentId);
        card.setBalance(50);
        cardMapper.saveCard(card);
    }
}
