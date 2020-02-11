package com.aowin.dao;

import com.aowin.model.Syuser;

public interface SyuserMapper {

	/**
	 * 通过手机号获取用户
	 * @param mobilePhone
	 * @return
	 */
	Syuser getSyuserByMobilePhone(String mobilePhone);

	/**
	 * 登录
	 * @param syuser
	 * @return
	 */
	Syuser login(Syuser syuser);

}
