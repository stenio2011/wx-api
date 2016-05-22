package cn.edu.bfsu.wxapi.salary;

import java.io.Serializable;
import java.math.BigDecimal;

public class OtherIncome implements Serializable {

	private static final long serialVersionUID = -1899363744590569828L;

	private String RESOURCE_ID;
	private String GH; // 工号
	private String XM; // 姓名
	private String NF; // 年份
	private String YF; // 月份
	private String BCYF; // 本次应发
	private BigDecimal BCKS; // 本次扣税
	private BigDecimal BCSF; // 本次实发
	private String ZY; // 摘要

	public String getRESOURCE_ID() {
		return RESOURCE_ID;
	}

	public void setRESOURCE_ID(String rESOURCE_ID) {
		RESOURCE_ID = rESOURCE_ID;
	}

	public String getGH() {
		return GH;
	}

	public void setGH(String gH) {
		GH = gH;
	}

	public String getXM() {
		return XM;
	}

	public void setXM(String xM) {
		XM = xM;
	}

	public String getNF() {
		return NF;
	}

	public void setNF(String nF) {
		NF = nF;
	}

	public String getYF() {
		return YF;
	}

	public void setYF(String yF) {
		YF = yF;
	}

	public String getBCYF() {
		return BCYF;
	}

	public void setBCYF(String bCYF) {
		BCYF = bCYF;
	}

	public BigDecimal getBCKS() {
		return BCKS;
	}

	public void setBCKS(BigDecimal bCKS) {
		BCKS = bCKS;
	}

	public BigDecimal getBCSF() {
		return BCSF;
	}

	public void setBCSF(BigDecimal bCSF) {
		BCSF = bCSF;
	}

	public String getZY() {
		return ZY;
	}

	public void setZY(String zY) {
		ZY = zY;
	}

}
