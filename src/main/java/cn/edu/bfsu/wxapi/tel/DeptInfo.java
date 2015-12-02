package cn.edu.bfsu.wxapi.tel;

import java.io.Serializable;

public class DeptInfo implements Serializable{

	private static final long serialVersionUID = -8850786195888867586L;

	private int depid;
	
	private String depname;

	public int getDepid() {
		return depid;
	}

	public void setDepid(int depid) {
		this.depid = depid;
	}

	public String getDepname() {
		return depname;
	}

	public void setDepname(String depname) {
		this.depname = depname;
	}
	
	
}
