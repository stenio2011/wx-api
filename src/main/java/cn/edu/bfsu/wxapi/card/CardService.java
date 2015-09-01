package cn.edu.bfsu.wxapi.card;

import java.util.List;
import java.util.Map;

public interface CardService {

	/**
	 * 获取用户信息
	 * 
	 * @param id
	 *            用户ID
	 * @return 用户信息
	 */
	public UserInfo getUserInfo(String id);

	/**
	 * 获取帐号余额
	 * 
	 * @param id
	 *            用户ID
	 * @return 当前余额
	 */
	public Map<String, String> getBalance(String id);

	
	/**
	 * 获取某年某月交易流水数量
	 * 
	 * @param id
	 * @param year
	 * @param month
	 * @return
	 */
	public int getResourceInfoSize(String id, String year, String month);
	
	/**
	 * 交易流水
	 * 
	 * @param id
	 * @param year
	 * @param month
	 * @param pageNo
	 * @param pageSize
	 * @return
	 */
	public List<ResourceInfo> getResourceInfo(String id, String year, String month, String pageNo, String pageSize);
}
