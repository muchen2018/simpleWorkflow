package com.dynastech.system.entity;

public class UserSerial extends User{

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column rs_user_Serial.id
	 * @mbggenerated  Fri Nov 24 18:05:56 CST 2017
	 */
	private String id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column rs_user_Serial.uid
	 * @mbggenerated  Fri Nov 24 18:05:56 CST 2017
	 */
	private String uid;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column rs_user_Serial.sid
	 * @mbggenerated  Fri Nov 24 18:05:56 CST 2017
	 */
	private String sid;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column rs_user_Serial.type
	 * @mbggenerated  Fri Nov 24 18:05:56 CST 2017
	 */
	private String type;
	
	private String sname;
	
	public String getSname() {
		return sname;
	}
	
	public void setSname(String sname) {
		this.sname = sname;
	}
	
	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column rs_user_Serial.id
	 * @return  the value of rs_user_Serial.id
	 * @mbggenerated  Fri Nov 24 18:05:56 CST 2017
	 */
	public String getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column rs_user_Serial.id
	 * @param id  the value for rs_user_Serial.id
	 * @mbggenerated  Fri Nov 24 18:05:56 CST 2017
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column rs_user_Serial.uid
	 * @return  the value of rs_user_Serial.uid
	 * @mbggenerated  Fri Nov 24 18:05:56 CST 2017
	 */
	public String getUid() {
		return uid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column rs_user_Serial.uid
	 * @param uid  the value for rs_user_Serial.uid
	 * @mbggenerated  Fri Nov 24 18:05:56 CST 2017
	 */
	public void setUid(String uid) {
		this.uid = uid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column rs_user_Serial.sid
	 * @return  the value of rs_user_Serial.sid
	 * @mbggenerated  Fri Nov 24 18:05:56 CST 2017
	 */
	public String getSid() {
		return sid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column rs_user_Serial.sid
	 * @param sid  the value for rs_user_Serial.sid
	 * @mbggenerated  Fri Nov 24 18:05:56 CST 2017
	 */
	public void setSid(String sid) {
		this.sid = sid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column rs_user_Serial.type
	 * @return  the value of rs_user_Serial.type
	 * @mbggenerated  Fri Nov 24 18:05:56 CST 2017
	 */
	public String getType() {
		return type;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column rs_user_Serial.type
	 * @param type  the value for rs_user_Serial.type
	 * @mbggenerated  Fri Nov 24 18:05:56 CST 2017
	 */
	public void setType(String type) {
		this.type = type;
	}
}