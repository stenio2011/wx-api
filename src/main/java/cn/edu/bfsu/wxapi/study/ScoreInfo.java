package cn.edu.bfsu.wxapi.study;

import java.io.Serializable;

/**
 * @author stenio
 *
 */
public class ScoreInfo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2500915015975701231L;

	/**
	 * 学号
	 */
	private String id;
	/**
	 * 姓名
	 */
	private String name;
	/**
	 * 年份
	 */
	private String year;
	/**
	 * 学期（春或秋）
	 */
	private String term;
	/**
	 * 课程ID
	 */
	private String classId;
	/**
	 * 课程名称
	 */
	private String className;
	/**
	 * 成绩
	 */
	private String score;

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

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getTerm() {
		return term;
	}

	public void setTerm(String term) {
		this.term = term;
	}

	public String getClassId() {
		return classId;
	}

	public void setClassId(String classId) {
		this.classId = classId;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getScore() {
		return score;
	}

	public void setScore(String score) {
		this.score = score;
	}

}
