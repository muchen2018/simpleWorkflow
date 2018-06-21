package com.dynastech.model.mapper;

import com.dynastech.model.entity.PersonAbility;
import com.dynastech.model.entity.PersonAbilityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PersonAbilityMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_ability
     *
     * @mbggenerated Thu Sep 28 18:12:50 CST 2017
     */
    int countByExample(PersonAbilityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_ability
     *
     * @mbggenerated Thu Sep 28 18:12:50 CST 2017
     */
    int deleteByExample(PersonAbilityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_ability
     *
     * @mbggenerated Thu Sep 28 18:12:50 CST 2017
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_ability
     *
     * @mbggenerated Thu Sep 28 18:12:50 CST 2017
     */
    int insert(PersonAbility record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_ability
     *
     * @mbggenerated Thu Sep 28 18:12:50 CST 2017
     */
    int insertSelective(PersonAbility record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_ability
     *
     * @mbggenerated Thu Sep 28 18:12:50 CST 2017
     */
    List<PersonAbility> selectByExample(PersonAbilityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_ability
     *
     * @mbggenerated Thu Sep 28 18:12:50 CST 2017
     */
    PersonAbility selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_ability
     *
     * @mbggenerated Thu Sep 28 18:12:50 CST 2017
     */
    int updateByExampleSelective(@Param("record") PersonAbility record, @Param("example") PersonAbilityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_ability
     *
     * @mbggenerated Thu Sep 28 18:12:50 CST 2017
     */
    int updateByExample(@Param("record") PersonAbility record, @Param("example") PersonAbilityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_ability
     *
     * @mbggenerated Thu Sep 28 18:12:50 CST 2017
     */
    int updateByPrimaryKeySelective(PersonAbility record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_ability
     *
     * @mbggenerated Thu Sep 28 18:12:50 CST 2017
     */
    int updateByPrimaryKey(PersonAbility record);
    
    List<PersonAbility> selectFullPersonAbility(@Param("efId")String efId);
    
    List<PersonAbility> selectPersonAbilityByFileId(@Param("fileId")String fileId);
}