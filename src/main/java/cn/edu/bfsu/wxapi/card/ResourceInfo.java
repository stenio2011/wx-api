package cn.edu.bfsu.wxapi.card;

import java.io.Serializable;

public class ResourceInfo implements Serializable{

	private static final long serialVersionUID = -8366629695036065946L;

	/**
	 * 流水号
	 */
	private String  resourceId;
	
	/**
	 * 交易时间
	 */
	private String time;
	
	/**
	 * 交易地点
	 */
	private String location;
	
	/**
	 * 交易类型
	 */
	private String tradeType;
	
	/**
	 * 金额
	 */
	private String amount;
	
	/**
	 * 余额
	 */
	private String balance;

	public String getResourceId() {
		return resourceId;
	}

	public void setResourceId(String resourceId) {
		this.resourceId = resourceId;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getTradeType() {
		return tradeType;
	}

	public void setTradeType(String tradeType) {
		this.tradeType = tradeType;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getBalance() {
		return balance;
	}

	public void setBalance(String balance) {
		this.balance = balance;
	}
	
	
	
}
