package com.vishal.sms.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class appController {
	
	private Translator translator;
	public appController( Translator translator )
    {
        super();
        this.translator = translator;
    }

	@GetMapping("/test")
	public Status test(@RequestHeader Map a)
	{
//		APPServiceCode ap = APPServiceCode.app2;
//		//String st1=APPServiceCode.app1.getStatusCode();
//		ap.statusCode="app1";
//		ap.statusDesc=translator.toLocal("app1");
//		String source= APPServiceCode.app1.getStatusDesc();
		Status s1=new Status();
		s1.setStatusCode("app3");
		s1.setStatusDesc("apple");
		if(true)
		{
			s1=new Status();
			s1.setStatusCode("app1");
			s1.setStatusDesc(translator.toLocal("app1"));
		}
		return s1;
	}
}
