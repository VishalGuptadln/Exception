package com.np.studentManagement.service;

import java.util.List;
import java.util.Optional;

import com.np.studentManagement.dto.studentId;
import com.np.studentManagement.dto.teacherId;
import com.np.studentManagement.entity.student;
import com.np.studentManagement.entity.subject;
import com.np.studentManagement.entity.teacher;

public interface service {

	public student saveStudentData(student st);
	public teacher saveTeacherData(teacher tech);
	public List<teacher> getTeacher();
	public Optional<teacher> getTeacherById(teacherId teacherId);
	public List<student> getStudent();
	public List<Object> getStudentByRollNo(studentId studentid);
	public String updateStudent(student std);
	public String updateTeacher(teacher tech);
	public subject saveSubjct(subject sub);
	public String updateSubject(subject sub);
	
}
