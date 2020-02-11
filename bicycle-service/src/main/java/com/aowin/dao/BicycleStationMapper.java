package com.aowin.dao;

import java.util.List;

import com.aowin.model.BicycleStation;

public interface BicycleStationMapper {

	/**
	 * 查询车点
	 * @param bicycleStation
	 * @return
	 */
	List<BicycleStation> listStation(BicycleStation bicycleStation);
}
