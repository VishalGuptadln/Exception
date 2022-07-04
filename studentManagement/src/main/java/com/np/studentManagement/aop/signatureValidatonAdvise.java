package com.np.studentManagement.aop;

import java.io.IOException;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import com.np.studentManagement.dto.studentId;
import com.np.studentManagement.dto.teacherId;

@Aspect
@Component
public class signatureValidatonAdvise {
	
	@Before("execution(* com.np.studentManagement.controller.controller.getStudentByRollNo(..))")
    public Object getStudentByRollNoAdvice( JoinPoint jp )
        throws Throwable
    {
        final Object[] args = jp.getArgs();
        studentId st= (studentId) args[0];
        if(st.getRollNo()<=0)
        {
        	throw new IOException("enter proper id");
        }
        return null;
    }
	
	@Before("execution(* com.np.studentManagement.controller.controller.getTeacherById(..))")
    public Object getTeacherByIdAdvice( JoinPoint jp )
        throws Throwable
    {
        final Object[] args = jp.getArgs();
        teacherId tid=  (teacherId) args[0];
        if(tid.getTid()<=0)
        {
        	throw new IOException("enter proper id");
        }
        return null;
    }
    
//	@Before("execution(* com.np.studentManagement.controller.controller.saveTeacher(..))")
//    public Object saveTeacherAdvice( JoinPoint jp )
//        throws Throwable
//    {
//        final Object[] args = jp.getArgs();
//        teacher tech=  (teacher) args[0];
//        if(tech.getTid()<=0)
//        {
//        	throw new IOException("enter proper id");
//        }
//        return null;
//    }
//	 
//	@Before("execution(* com.np.studentManagement.controller.controller.saveStudent(..))")
//    public Object saveStudentAdvice( JoinPoint jp )
//        throws Throwable
//    {
//        final Object[] args = jp.getArgs();
//        student std=   (student) args[0];
//        if(std.getRollNo()<=0)
//        {
//        	throw new IOException("enter proper id");   
//        }
//        return null;
//    }

}
