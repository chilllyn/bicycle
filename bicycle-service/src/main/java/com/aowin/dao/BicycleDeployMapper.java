package com.aowin.dao;

import com.aowin.model.BicycleDeploy;

public interface BicycleDeployMapper {

	/**
	 * 增加调出明细
	 * @param bicycleDeploy
	 * @param fromReason
	 * @return
	 */
	int insertFrom(BicycleDeploy bicycleDeploy);

	/**
	 * 增加调入明细
	 * @param bicycleDeploy
	 * @return
	 */
	int insertTo(BicycleDeploy bicycleDeploy);
}
