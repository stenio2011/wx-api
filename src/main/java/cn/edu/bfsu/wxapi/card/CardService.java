package cn.edu.bfsu.wxapi.card;

import java.util.Map;

import cn.edu.bfsu.wxapi.DataGridResult;

public interface CardService {

	/**
	 * 获取用户信息
	 * 
	 * @param id
	 *            用户ID
	 * @return 用户信息
	 */
	UserInfo getUserInfo(String id);

	/**
	 * 获取帐号余额
	 * 
	 * @param id
	 *            用户ID
	 * @return "id" 用户ID "name" 用户姓名 "balance" 余额
	 */
	Map<String, Object> getBalance(String id);

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
	DataGridResult<ResourceInfo> getResourceInfo(String id, String year, String month, String pageNo, String pageSize);
}
