package com.aowin.dao;

import java.util.List;

import com.aowin.model.MsPhase;

public interface MsPhaseMapper {
	/**
	 * 新增权限
	 * @param msPhase
	 * @return
	 */
	int insert(MsPhase msPhase);

	/**
	 * 修改权限
	 * @param msPhase
	 * @return
	 */
	int update(MsPhase msPhase);

	/**
	 * 查询权限
	 * @param msPhase
	 * @return
	 */
	List<MsPhase> select(MsPhase msPhase);

	/**
	 * 根据id查询权限
	 * @param phaseId
	 * @return
	 */
	MsPhase selectById(int phaseId);

	/**
	 * 删除权限
	 * @param phaseId
	 * @return
	 */
	int delete(int phaseId);

}
