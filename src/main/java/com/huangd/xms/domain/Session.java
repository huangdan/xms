package com.huangd.xms.domain;

import cn.songm.common.beans.Entity;

public class Session extends Entity {

	private static final long serialVersionUID = 8843377540922969541L;

	private String sesId;

	public Session(String sesId) {
		this.sesId = sesId;
	}
	
	public String getSesId() {
		return sesId;
	}

	public void setSesId(String sesId) {
		this.sesId = sesId;
	}
}
