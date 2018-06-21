package com.dynastech.system.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.dynastech.system.entity.RoleUser;
import com.dynastech.system.entity.RoleUserExample;
import com.dynastech.system.entity.RoleUserKey;

public interface RoleUserMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table RS_RoleUser
	 * @mbggenerated  Thu Nov 09 09:25:16 CST 2017
	 */
	int countByExample(RoleUserExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table RS_RoleUser
	 * @mbggenerated  Thu Nov 09 09:25:16 CST 2017
	 */
	int deleteByExample(RoleUserExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table RS_RoleUser
	 * @mbggenerated  Thu Nov 09 09:25:16 CST 2017
	 */
	int deleteByPrimaryKey(RoleUserKey key);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table RS_RoleUser
	 * @mbggenerated  Thu Nov 09 09:25:16 CST 2017
	 */
	int insert(RoleUser record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table RS_RoleUser
	 * @mbggenerated  Thu Nov 09 09:25:16 CST 2017
	 */
	int insertSelective(RoleUser record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table RS_RoleUser
	 * @mbggenerated  Thu Nov 09 09:25:16 CST 2017
	 */
	List<RoleUser> selectByExample(RoleUserExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table RS_RoleUser
	 * @mbggenerated  Thu Nov 09 09:25:16 CST 2017
	 */
	RoleUser selectByPrimaryKey(RoleUserKey key);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table RS_RoleUser
	 * @mbggenerated  Thu Nov 09 09:25:16 CST 2017
	 */
	int updateByExampleSelective(@Param("record") RoleUser record, @Param("example") RoleUserExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table RS_RoleUser
	 * @mbggenerated  Thu Nov 09 09:25:16 CST 2017
	 */
	int updateByExample(@Param("record") RoleUser record, @Param("example") RoleUserExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table RS_RoleUser
	 * @mbggenerated  Thu Nov 09 09:25:16 CST 2017
	 */
	int updateByPrimaryKeySelective(RoleUser record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table RS_RoleUser
	 * @mbggenerated  Thu Nov 09 09:25:16 CST 2017
	 */
	int updateByPrimaryKey(RoleUser record);
}