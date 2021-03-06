package com.aowin.listener;

import java.util.concurrent.TimeUnit;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

@Component
public class SendCodeListener implements MessageListener {

	@Autowired
	private StringRedisTemplate stringRedisTemlate;

	@Override
	public void onMessage(Message message) {
		TextMessage msg = (TextMessage) message;
		try {
			String mobilePhone = msg.getText();
			String verificationCode = (int) ((Math.random() * 9 + 1) * 1000) + "";
			stringRedisTemlate.opsForValue().set(mobilePhone, verificationCode, 10, TimeUnit.MINUTES);

			System.out.println(mobilePhone + ":" + verificationCode);
		} catch (JMSException e) {
			e.printStackTrace();
		}
	}

}
