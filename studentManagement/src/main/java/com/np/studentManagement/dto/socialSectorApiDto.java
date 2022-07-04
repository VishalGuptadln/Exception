package com.np.studentManagement.dto;

import java.util.List;

import com.np.studentManagement.entity.TrainerDataApiEntity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class socialSectorApiDto {
	
	private List<TrainerDataApiEntity> json_data;

}
