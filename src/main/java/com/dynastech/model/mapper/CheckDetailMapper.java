package com.dynastech.model.mapper;

import com.dynastech.model.entity.CheckDetail;
import com.dynastech.model.entity.CheckDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CheckDetailMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table T_Apply_CheckDetail
	 * @mbggenerated  Wed Nov 29 09:19:21 CST 2017
	 */
	int countByExample(CheckDetailExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table T_Apply_CheckDetail
	 * @mbggenerated  Wed Nov 29 09:19:21 CST 2017
	 */
	int deleteByExample(CheckDetailExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table T_Apply_CheckDetail
	 * @mbggenerated  Wed Nov 29 09:19:21 CST 2017
	 */
	int insert(CheckDetail record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table T_Apply_CheckDetail
	 * @mbggenerated  Wed Nov 29 09:19:21 CST 2017
	 */
	int insertSelective(CheckDetail record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table T_Apply_CheckDetail
	 * @mbggenerated  Wed Nov 29 09:19:21 CST 2017
	 */
	List<CheckDetail> selectByExample(CheckDetailExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table T_Apply_CheckDetail
	 * @mbggenerated  Wed Nov 29 09:19:21 CST 2017
	 */
	int updateByExampleSelective(@Param("record") CheckDetail record, @Param("example") CheckDetailExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table T_Apply_CheckDetail
	 * @mbggenerated  Wed Nov 29 09:19:21 CST 2017
	 */
	int updateByExample(@Param("record") CheckDetail record, @Param("example") CheckDetailExample example);
}