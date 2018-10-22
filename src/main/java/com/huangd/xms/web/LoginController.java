package com.huangd.xms.web;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.huangd.xms.domain.User;
import com.huangd.xms.service.UserService;

import cn.songm.common.beans.Result;
import cn.songm.common.service.ServiceException;

@Controller
@RequestMapping("/")
public class LoginController extends XmsController {

	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "login.json")
    @ResponseBody
    public Result<User> login(String account, String password, String vcode,
            HttpServletRequest request) {
        Result<User> result = new Result<User>();
        
        User user = null;
        try {
            user = userService.checkLogin(account, password);
        } catch (ServiceException e) {
            result.setErrorCode(e.getErrCode());
            result.setErrorDesc(e.getErrNotice());
            return result;
        }

        result.setData(user);
        return result; 
    }
}
