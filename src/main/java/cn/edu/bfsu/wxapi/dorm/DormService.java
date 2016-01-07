package cn.edu.bfsu.wxapi.dorm;

import java.util.Map;

public interface DormService {
	
	/**
	 * 根据学好获取宿舍
	 * 
	 * @param id
	 * @return map name : 学生姓名, dorm: 宿舍名
	 */
	Map<String, Object> getDormById(String id);
	
}
