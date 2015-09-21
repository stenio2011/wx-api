package cn.edu.bfsu.wxapi.study;

import java.util.List;

public interface StudyService {

	/**
	 * 获取成绩列表
	 * 
	 * @param id 学号
	 * @param year 年份
	 * @param term 学期（春、秋）
	 * @return List<ScoreInfo>
	 */
	List<ScoreInfo> listScore(String id, String year, String term);
}
