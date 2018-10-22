package com.huangd.xms.service.impl;

import java.util.Date;

import org.springframework.stereotype.Service;

import com.huangd.xms.domain.User;
import com.huangd.xms.service.UserService;
import com.huangd.xms.service.XmsErrorCode;

import cn.songm.common.service.ServiceException;

@Service("userService")
public class UserServcieImpl implements UserService {

	@Override
	public User checkLogin(String account, String password) throws ServiceException {
		if (!"zhangsong".equals(account)) {
			throw new ServiceException(XmsErrorCode.A_001.getErrCode(), "用户名密码错误");
		}

		User u = new User();
		u.setUserId(1000l);
		u.setAccount("zhangsong");
		u.setRealName("张松");
		u.setCreated(new Date());
		u.setUpdated(new Date());
		u.setRemark("描述信息");
		u.setVersion(0);
		return u;
	}

}
