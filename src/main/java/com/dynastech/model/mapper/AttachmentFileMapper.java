package com.dynastech.model.mapper;

import com.dynastech.model.entity.AttachmentFile;
import com.dynastech.model.entity.AttachmentFileBean;
import com.dynastech.model.entity.AttachmentFileExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AttachmentFileMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table T_Attachment_File
	 * @mbggenerated  Sat Sep 30 16:08:09 CST 2017
	 */
	int countByExample(AttachmentFileExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table T_Attachment_File
	 * @mbggenerated  Sat Sep 30 16:08:09 CST 2017
	 */
	int deleteByExample(AttachmentFileExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table T_Attachment_File
	 * @mbggenerated  Sat Sep 30 16:08:09 CST 2017
	 */
	int deleteByPrimaryKey(String guid);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table T_Attachment_File
	 * @mbggenerated  Sat Sep 30 16:08:09 CST 2017
	 */
	int insert(AttachmentFile record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table T_Attachment_File
	 * @mbggenerated  Sat Sep 30 16:08:09 CST 2017
	 */
	int insertSelective(AttachmentFile record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table T_Attachment_File
	 * @mbggenerated  Sat Sep 30 16:08:09 CST 2017
	 */
	List<AttachmentFile> selectByExample(AttachmentFileExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table T_Attachment_File
	 * @mbggenerated  Sat Sep 30 16:08:09 CST 2017
	 */
	AttachmentFile selectByPrimaryKey(String guid);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table T_Attachment_File
	 * @mbggenerated  Sat Sep 30 16:08:09 CST 2017
	 */
	int updateByExampleSelective(@Param("record") AttachmentFile record,
			@Param("example") AttachmentFileExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table T_Attachment_File
	 * @mbggenerated  Sat Sep 30 16:08:09 CST 2017
	 */
	int updateByExample(@Param("record") AttachmentFile record, @Param("example") AttachmentFileExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table T_Attachment_File
	 * @mbggenerated  Sat Sep 30 16:08:09 CST 2017
	 */
	int updateByPrimaryKeySelective(AttachmentFile record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table T_Attachment_File
	 * @mbggenerated  Sat Sep 30 16:08:09 CST 2017
	 */
	int updateByPrimaryKey(AttachmentFile record);
	
	List<AttachmentFileBean> getAttachmentFileBean(@Param("userId")String userId,@Param("searchText")String searchText);
}