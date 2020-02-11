package com.aowin.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.aowin.model.Card;
import com.aowin.service.CardService;

@RestController
@RequestMapping("/card")
public class CardContoller {

	private Logger logger = Logger.getLogger(CardContoller.class);

	@Autowired
	private CardService cardServiceImpl;

	@RequestMapping(value = "/getCardByCardCode", method = { RequestMethod.POST }, produces = {
	        "application/json;charset=utf-8" })
	public Card getCardByCardCode(Card card) {
		return cardServiceImpl.getCardByCardCode(card.getCardCode());
	}
}
