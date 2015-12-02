package cn.edu.bfsu.wxapi.tel;

import java.util.List;

public interface TelService {

	public List<DeptInfo> listDept();
	
	public List<TelInfo> listTel(int deptId);

}
