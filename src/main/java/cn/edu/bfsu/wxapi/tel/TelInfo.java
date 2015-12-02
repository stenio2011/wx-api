package cn.edu.bfsu.wxapi.tel;

import java.io.Serializable;

public class TelInfo implements Serializable{

	private static final long serialVersionUID = -8415485683375034390L;

	private int depid;
	
	private String childdep;
	
	private String telvalues;

	public int getDepid() {
		return depid;
	}

	public void setDepid(int depid) {
		this.depid = depid;
	}

	public String getChilddep() {
		return childdep;
	}

	public void setChilddep(String childdep) {
		this.childdep = childdep;
	}

	public String getTelvalues() {
		return telvalues;
	}

	public void setTelvalues(String telvalues) {
		this.telvalues = telvalues;
	}
	
}
