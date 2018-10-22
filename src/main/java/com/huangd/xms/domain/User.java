package com.huangd.xms.domain;

import cn.songm.common.beans.Entity;

public class User extends Entity {

	private static final long serialVersionUID = 6318434822975705088L;

	private Long userId;
	private String account;
	private String password;
	private String realName;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}
}
