package com.huangd.xms.service;

import com.huangd.xms.domain.User;

import cn.songm.common.service.ServiceException;

public interface UserService {

	User checkLogin(String account, String password) throws ServiceException;

}
