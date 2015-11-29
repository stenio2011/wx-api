package cn.edu.bfsu.wxapi.auth;

public interface AuthenticationService {
	
	/**
	 * 用户认证
	 * 
	 * @param id 学/工号
	 * @param password 密码
	 * @return 认证结果
	 */
	public AuthenticationType authenticate(String id, String password);
}
