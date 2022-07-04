package com.vishal.sms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.vishal.sms.entity.Student;
import com.vishal.sms.service.service;

@Controller
public class StudentController {
	
	@Autowired
	private service serv;
	
	@GetMapping("/students")
	public String listStudent(Model model)
	{
		model.addAttribute("students", serv.getAllStudents());
		return "students";
	}
	@GetMapping("/student/new")
	public String createStudentForm(Model model)
	{
		Student student=new Student();
		model.addAttribute("student", student);
		return "create_student";
	}
	
	@PostMapping("/students")
	public String saveStudent(@ModelAttribute("student") Student student){
		serv.saveStudent(student);
		return "redirect:/students";		
	}
	

}
