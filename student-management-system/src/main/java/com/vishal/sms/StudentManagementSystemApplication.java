package com.vishal.sms;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.apache.log4j.Logger;
import org.apache.log4j.MDC;
import org.apache.logging.log4j.ThreadContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

import com.vishal.sms.entity.Student;
import com.vishal.sms.repo.StudentRepo;

@SpringBootApplication
@EnableAsync
public class StudentManagementSystemApplication implements CommandLineRunner{

	private static final Logger LOGGER = Logger.getLogger( StudentManagementSystemApplication.class);
	
	
	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
		System.out.println("Hello world");
		
        
	}
	@Autowired
	private StudentRepo sr;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
//		Student student1= new Student("Ramesh","Fadatare","ramesh@gmail.com");
//		sr.save(student1);
//		Student student2= new Student("sanjay","jadav","sanjay@gmail.com");
//		sr.save(student2);
//		Student student3= new Student("tony","stark","tony@gmail.com");
//		sr.save(student3);
		
		
	}

}
