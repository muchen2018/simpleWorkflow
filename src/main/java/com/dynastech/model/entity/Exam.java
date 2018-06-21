package com.dynastech.model.entity;

import java.util.Date;

public class Exam {
	
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_exam.id
	 * @mbggenerated  Thu Nov 30 16:50:09 CST 2017
	 */
	private String id;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_exam.username
	 * @mbggenerated  Thu Nov 30 16:50:09 CST 2017
	 */
	private String username;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_exam.kind
	 * @mbggenerated  Thu Nov 30 16:50:09 CST 2017
	 */
	private String kind;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_exam.date
	 * @mbggenerated  Thu Nov 30 16:50:09 CST 2017
	 */
	private String date;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_exam.score
	 * @mbggenerated  Thu Nov 30 16:50:09 CST 2017
	 */
	private String score;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_exam.DateTimeCreated
	 * @mbggenerated  Thu Nov 30 16:50:09 CST 2017
	 */
	private Date datetimecreated;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_exam.DateTimeModified
	 * @mbggenerated  Thu Nov 30 16:50:09 CST 2017
	 */
	private Date datetimemodified;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_exam.isDeleted
	 * @mbggenerated  Thu Nov 30 16:50:09 CST 2017
	 */
	private Boolean isdeleted;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_exam.seq
	 * @mbggenerated  Thu Nov 30 16:50:09 CST 2017
	 */
	private String seq;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_exam.level
	 * @mbggenerated  Thu Nov 30 16:50:09 CST 2017
	 */
	private String level;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_exam.userId
	 * @mbggenerated  Thu Nov 30 16:50:09 CST 2017
	 */
	private String userid;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_exam.id
	 * @return  the value of t_exam.id
	 * @mbggenerated  Thu Nov 30 16:50:09 CST 2017
	 */
	public String getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_exam.id
	 * @param id  the value for t_exam.id
	 * @mbggenerated  Thu Nov 30 16:50:09 CST 2017
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_exam.username
	 * @return  the value of t_exam.username
	 * @mbggenerated  Thu Nov 30 16:50:09 CST 2017
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_exam.username
	 * @param username  the value for t_exam.username
	 * @mbggenerated  Thu Nov 30 16:50:09 CST 2017
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_exam.kind
	 * @return  the value of t_exam.kind
	 * @mbggenerated  Thu Nov 30 16:50:09 CST 2017
	 */
	public String getKind() {
		return kind;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_exam.kind
	 * @param kind  the value for t_exam.kind
	 * @mbggenerated  Thu Nov 30 16:50:09 CST 2017
	 */
	public void setKind(String kind) {
		this.kind = kind;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_exam.date
	 * @return  the value of t_exam.date
	 * @mbggenerated  Thu Nov 30 16:50:09 CST 2017
	 */
	public String getDate() {
		return date;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_exam.date
	 * @param date  the value for t_exam.date
	 * @mbggenerated  Thu Nov 30 16:50:09 CST 2017
	 */
	public void setDate(String date) {
		this.date = date;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_exam.score
	 * @return  the value of t_exam.score
	 * @mbggenerated  Thu Nov 30 16:50:09 CST 2017
	 */
	public String getScore() {
		return score;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_exam.score
	 * @param score  the value for t_exam.score
	 * @mbggenerated  Thu Nov 30 16:50:09 CST 2017
	 */
	public void setScore(String score) {
		this.score = score;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_exam.DateTimeCreated
	 * @return  the value of t_exam.DateTimeCreated
	 * @mbggenerated  Thu Nov 30 16:50:09 CST 2017
	 */
	public Date getDatetimecreated() {
		return datetimecreated;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_exam.DateTimeCreated
	 * @param datetimecreated  the value for t_exam.DateTimeCreated
	 * @mbggenerated  Thu Nov 30 16:50:09 CST 2017
	 */
	public void setDatetimecreated(Date datetimecreated) {
		this.datetimecreated = datetimecreated;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_exam.DateTimeModified
	 * @return  the value of t_exam.DateTimeModified
	 * @mbggenerated  Thu Nov 30 16:50:09 CST 2017
	 */
	public Date getDatetimemodified() {
		return datetimemodified;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_exam.DateTimeModified
	 * @param datetimemodified  the value for t_exam.DateTimeModified
	 * @mbggenerated  Thu Nov 30 16:50:09 CST 2017
	 */
	public void setDatetimemodified(Date datetimemodified) {
		this.datetimemodified = datetimemodified;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_exam.isDeleted
	 * @return  the value of t_exam.isDeleted
	 * @mbggenerated  Thu Nov 30 16:50:09 CST 2017
	 */
	public Boolean getIsdeleted() {
		return isdeleted;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_exam.isDeleted
	 * @param isdeleted  the value for t_exam.isDeleted
	 * @mbggenerated  Thu Nov 30 16:50:09 CST 2017
	 */
	public void setIsdeleted(Boolean isdeleted) {
		this.isdeleted = isdeleted;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_exam.seq
	 * @return  the value of t_exam.seq
	 * @mbggenerated  Thu Nov 30 16:50:09 CST 2017
	 */
	public String getSeq() {
		return seq;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_exam.seq
	 * @param seq  the value for t_exam.seq
	 * @mbggenerated  Thu Nov 30 16:50:09 CST 2017
	 */
	public void setSeq(String seq) {
		this.seq = seq;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_exam.level
	 * @return  the value of t_exam.level
	 * @mbggenerated  Thu Nov 30 16:50:09 CST 2017
	 */
	public String getLevel() {
		return level;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_exam.level
	 * @param level  the value for t_exam.level
	 * @mbggenerated  Thu Nov 30 16:50:09 CST 2017
	 */
	public void setLevel(String level) {
		this.level = level;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_exam.userId
	 * @return  the value of t_exam.userId
	 * @mbggenerated  Thu Nov 30 16:50:09 CST 2017
	 */
	public String getUserid() {
		return userid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_exam.userId
	 * @param userid  the value for t_exam.userId
	 * @mbggenerated  Thu Nov 30 16:50:09 CST 2017
	 */
	public void setUserid(String userid) {
		this.userid = userid;
	}

	private String seqV;
	
	private String gradeV;

	public String getSeqV() {
		return seqV;
	}

	public void setSeqV(String seqV) {
		this.seqV = seqV;
	}

	public String getGradeV() {
		return gradeV;
	}

	public void setGradeV(String gradeV) {
		this.gradeV = gradeV;
	}
}