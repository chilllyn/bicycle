package com.aowin.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aowin.dao.CardMapper;
import com.aowin.model.Card;
import com.aowin.service.CardService;

@Service
public class CardServiceImpl implements CardService {

	@Autowired
	CardMapper cardMapper;

	@Override
	public Card getCardByCardCode(String cardCode) {
		return cardMapper.getCardByCardCode(cardCode);
	}

}
