package com.vishal.sms.controller;

public enum APPServiceCode {

	app1("app1","hello"),
	app2("app2","hello");

	String statusCode = null;
    String statusDesc = null;
    private APPServiceCode( String statusCode, String statusDesc )
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
