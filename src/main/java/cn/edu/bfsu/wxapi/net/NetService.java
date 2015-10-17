package cn.edu.bfsu.wxapi.net;

import java.util.Map;

/**
 * 上网自助相关接口
 * 
 * @author stenio
 *
 */
public interface NetService {

	/**
	 * 返回上网余额
	 * 
	 * @param id
	 *            学、工号
	 * @return String 余额
	 */
	public String getBalance(String id);

	/**
	 * @param id
	 *            学、工号
	 * @param cardNo
	 *            卡号
	 * @param password
	 *            密码
	 * @return Map<String, String> 如果充值失败，返回key为r_message：提示信息。
	 *         如果充值成功，返回key为v_balance：充值后余额。 两个值不同时出现。
	 */
	public Map<String, String> charge(String id, String cardNo, String password);

	/**
	 * 
	 * 暂停网络
	 * 
	 * @param id
	 *            学、工号
	 * @return String 如果成功返回空串""， 如果失败返回失败消息
	 */
	public String suspend(String id);

	/**
	 * 
	 * 启用网络
	 * 
	 * @param id
	 *            学、工号
	 * @return String 如果成功返回空串""， 如果失败返回失败消息
	 */
	public String unsuspend(String id);
}
