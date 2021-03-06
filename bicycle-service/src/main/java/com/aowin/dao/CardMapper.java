package com.aowin.dao;

import com.aowin.model.Card;

public interface CardMapper {

	/**
	 * 根据卡编号获得卡对象
	 * @param cardCode
	 * @return
	 */
	Card getCardByCardCode(String cardCode);
}
