package com.huangd.xms.service.impl;

import org.springframework.stereotype.Service;

import com.huangd.xms.domain.Session;
import com.huangd.xms.service.SessionService;

@Service("sessionService")
public class SessionServiceImpl implements SessionService {

	@Override
	public Session report(String sessioId) {
		return new Session("ABCDE_001");
	}

}
