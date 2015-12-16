package cn.edu.bfsu.wxapi.study;

import java.io.Serializable;

public class CourseInfo implements Serializable{

	private static final long serialVersionUID = 2243146631169898353L;

	/**
	 * 课程号
	 */
	private String kch; 
	
	/**
	 * 课程名称
	 */
	private String kcmc;
	
	/**
	 * 学年
	 */
	private String xn;
	
	/**
	 * 学期
	 */
	private String xq;
	
	/**
	 * 周次分布
	 */
	private String zcfb;
	
	/**
	 * 星期几
	 */
	private String day;
	
	/**
	 * 开始时间
	 */
	private String KSSJ;
	
	/**
	 * 结束时间
	 */
	private String JSSJ;
	
	/**
	 * 教室名称
	 */
	private String jsmc;

	public String getKch() {
		return kch;
	}

	public void setKch(String kch) {
		this.kch = kch;
	}

	public String getKcmc() {
		return kcmc;
	}

	public void setKcmc(String kcmc) {
		this.kcmc = kcmc;
	}

	public String getXn() {
		return xn;
	}

	public void setXn(String xn) {
		this.xn = xn;
	}

	public String getXq() {
		return xq;
	}

	public void setXq(String xq) {
		this.xq = xq;
	}

	public String getZcfb() {
		return zcfb;
	}

	public void setZcfb(String zcfb) {
		this.zcfb = zcfb;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public String getJsmc() {
		return jsmc;
	}

	public void setJsmc(String jsmc) {
		this.jsmc = jsmc;
	}

	public String getKSSJ() {
		return KSSJ;
	}

	public void setKSSJ(String kSSJ) {
		KSSJ = kSSJ;
	}

	public String getJSSJ() {
		return JSSJ;
	}

	public void setJSSJ(String jSSJ) {
		JSSJ = jSSJ;
	}
	
}
