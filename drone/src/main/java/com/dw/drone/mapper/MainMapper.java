package com.dw.drone.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.dw.drone.vo.JoinVO;

@Mapper
public interface MainMapper {

	// 회원가입 정보
	public int insertUsers(JoinVO vo);
	
}
