package com.np.studentManagement.dto;

public enum AppCode {
	
	App001("App001111","hello world"),
	App002("App002222","hello world 2"),;

	String statusCode = null;
    String statusDesc = null;
    private AppCode( String statusCode, String statusDesc )
    {
        this.statusCode = statusCode;
        this.statusDesc = statusDesc;
    }

    public String getStatusCode()
    {
        return statusCode;
    }

    public String getStatusDesc()
    {
        return statusDesc;
    }
	

}
