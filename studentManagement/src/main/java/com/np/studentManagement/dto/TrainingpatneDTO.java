package com.np.studentManagement.dto;

import java.util.List;

import com.np.studentManagement.entity.TrainingPartnerApi;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TrainingpatneDTO {

	private List<TrainingPartnerApi> json_data;
}
