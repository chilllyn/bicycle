package com.aowin.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aowin.dao.SyuserMapper;
import com.aowin.model.Syuser;
import com.aowin.service.SyuserService;

@Service
public class SyuserServiceImpl implements SyuserService {

	@Autowired
	private SyuserMapper syuserMapper;
	//	@Autowired
	//	private StringRedisTemplate stringRedisTemlate;

	@Override
	public Syuser login(Syuser syuser) {
		return syuserMapper.login(syuser);
	}

	//	@Override
	//	public Syuser loginByVerificationCode(String mobilePhone, String verificationCode) {
	//		String code = stringRedisTemlate.opsForValue().get(mobilePhone);
	//		if (!code.equals(verificationCode)) {
	//			return null;
	//		}
	//		return syuserMapper.getSyuserByMobilePhone(mobilePhone);
	//	}

	@Override
	public Syuser getSyuserByMobilePhone(String mobilePhone) {
		return syuserMapper.getSyuserByMobilePhone(mobilePhone);
	}

}
