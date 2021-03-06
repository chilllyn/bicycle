package com.aowin.service;

import com.aowin.model.Syuser;

public interface SyuserService {

	/**
	 * 通过手机号获取用户
	 * @param mobilePhone
	 * @return
	 */
	Syuser getSyuserByMobilePhone(String mobilePhone);

	/**
	 * 验证码登录
	 * @param mobilePhone
	 * @param verificationCode
	 * @return
	 */
	//	Syuser loginByVerificationCode(String mobilePhone, String verificationCode);

	/**
	 * 用户名密码登录
	 * @param syuser
	 * @return
	 */
	Syuser login(Syuser syuser);

}
