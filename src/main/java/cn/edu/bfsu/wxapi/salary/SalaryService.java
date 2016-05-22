package cn.edu.bfsu.wxapi.salary;

import java.util.List;

public interface SalaryService {
	/**
	 * 按年份获取工资信息
	 * 
	 * @param year
	 *            年份
	 * @param id
	 *            工号
	 * @return
	 */
	public List<SalaryInfo> getSalaryByYear(String year, String id);

	/**
	 * 按年、月获取工资信息
	 * 
	 * @param year
	 *            年份
	 * @param month
	 *            月份
	 * @param id
	 *            ID
	 * @return
	 */
	public SalaryInfo getSalaryByMonth(String year, String month, String id);

	/**
	 * 获取其他收入
	 * 
	 * @param year
	 * @param id
	 * @return
	 */
	public List<OtherIncome> getOtherIncoumeByYear(String year, String id);

	/**
	 * 获取其他收入
	 * 
	 * @param year
	 * @param month
	 * @param id
	 * @return
	 */
	public List<OtherIncome> getOtherIncoumeByMonth(String year, String month, String id);

}
