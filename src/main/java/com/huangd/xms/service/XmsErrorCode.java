package com.huangd.xms.service;

import cn.songm.common.service.ErrorInfo;

public enum XmsErrorCode implements ErrorInfo {
    // --------------------
	/** 用户名密码错误 */
	A_001("A_001"),
	A_002("A_002"),
    
    // --------------------
	B_001("B_001"),
	B_002("B_002")
	;
	
    private final String errCode;
    
    @Override
    public String getErrCode() {
        return errCode;
    }

    private XmsErrorCode(String errCode) {
        this.errCode = errCode;
    }

    public XmsErrorCode getInstance(String errCode) {
        for (XmsErrorCode m : XmsErrorCode.values()) {
            if (m.getErrCode().equals(errCode)) {
                return m;
            }
        }
        return null;
    }
}
