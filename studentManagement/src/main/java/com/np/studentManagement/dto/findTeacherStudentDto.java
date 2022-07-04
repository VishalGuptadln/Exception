package com.np.studentManagement.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class findTeacherStudentDto {
	
	private String teacherName;
	private String rollNo;

}
