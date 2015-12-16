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

	/**
	 * 获取课程列表
	 * 
	 * @param id 学号
	 * @param year 年份
	 * @param term 学期（春、秋）
	 * @param dateBegin 开始日期 格式yyyy-MM-dd
	 * @param dateEnd 结束日期 格式yyyy-MM-dd
	 * @return
	 */
	List<CourseInfo> listCourse(String id, String year, String term, String dateBegin, String dateEnd);
}
