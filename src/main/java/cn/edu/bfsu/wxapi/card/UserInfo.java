package cn.edu.bfsu.wxapi.card;

import java.io.Serializable;

public class UserInfo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5303366106778337059L;

	/**
	 * 卡号
	 */
	private String id;

	/**
	 * 姓名
	 */
	private String name;

	/**
	 * 身份类型
	 */
	private String idType;

	/**
	 * 证件类型
	 */
	private String idCardType;

	/**
	 * 证件编号
	 */
	private String idCardNo;

	/**
	 * 所属部门
	 */
	private String unitName;

	/**
	 * 性别
	 */
	private String sex;

	/**
	 * 国籍
	 */
	private String nationality;

	/**
	 * 证件照地址
	 */
	private String photoUrl;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIdType() {
		return idType;
	}

	public void setIdType(String idType) {
		this.idType = idType;
	}

	public String getIdCardType() {
		return idCardType;
	}

	public void setIdCardType(String idCardType) {
		this.idCardType = idCardType;
	}

	public String getIdCardNo() {
		return idCardNo;
	}

	public void setIdCardNo(String idCardNo) {
		this.idCardNo = idCardNo;
	}

	public String getUnitName() {
		return unitName;
	}

	public void setUnitName(String unitName) {
		this.unitName = unitName;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getPhotoUrl() {
		return photoUrl;
	}

	public void setPhotoUrl(String photoUrl) {
		this.photoUrl = photoUrl;
	}

}
