package com.np.studentManagement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.np.studentManagement.dto.studentId;
import com.np.studentManagement.dto.teacherId;
import com.np.studentManagement.entity.student;
import com.np.studentManagement.entity.subject;
import com.np.studentManagement.entity.teacher;
import com.np.studentManagement.repository.studentRepo;
import com.np.studentManagement.repository.subjectRepo;
import com.np.studentManagement.repository.teacherRepo;

@Service
public class serviceImpl implements service {

	@Autowired
	private studentRepo stRepo;
	
	@Autowired
	private teacherRepo techRepo;
	
	@Autowired
	private subjectRepo subRepo;
	
	@Override
	public student saveStudentData(student st) {
		
		return stRepo.save(st);
	}

	@Override
	public teacher saveTeacherData(teacher tech) {
		return techRepo.save(tech);
	}
	
	@Override
	public subject saveSubjct(subject sub) {
		return this.subRepo.save(sub);
	}
	
	@Override
	public List<teacher> getTeacher() {
		return techRepo.findAll();
	}

	@Override
	public Optional<teacher> getTeacherById(teacherId teachId) {
		return techRepo.findById(teachId.getTid());
	}

	@Override
	public List<student> getStudent() {
		return stRepo.findAll();
	}

	@Override
	public List<Object> getStudentByRollNo(studentId studentid) {
		return stRepo.getUserByRollNo(studentid.getRollNo());
	}

	@Override
	public String updateStudent(student std) {
		
		Optional<student> st2=this.stRepo.findById((std.getRollNo()));
		if (st2.isPresent()) {
			stRepo.save(std);
			return "Student updated successfully";
		}
		
		return "this id is not present in DB";
	}

	@Override
	public String updateTeacher(teacher tech) {
		
		Optional<teacher> tech2=this.techRepo.findById(tech.getTid());
		if(tech2.isPresent())
		{
			this.techRepo.save(tech);
			return "Teacher updated successfully";
		}
		return "this id is not present in DB";
	}

	@Override
	public String updateSubject(subject sub) {
		Optional<subject> sub2= this.subRepo.findById(sub.getSubjectId());
		if(sub2.isPresent())
		{
			this.subRepo.save(sub);
			return "Subject is update sussfully";
		}
		return "this id is not present in DB";
	}


}
