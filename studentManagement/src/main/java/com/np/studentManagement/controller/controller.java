package com.np.studentManagement.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.np.studentManagement.Exception.ResourceNotFound;
import com.np.studentManagement.dto.AppCode;
import com.np.studentManagement.dto.RequestDto;
import com.np.studentManagement.dto.socialSectorApiDto;
import com.np.studentManagement.dto.studentId;
import com.np.studentManagement.dto.teacherId;
import com.np.studentManagement.entity.CostCategoryApiRepo;
import com.np.studentManagement.entity.Schemewise_API_Entity;
import com.np.studentManagement.entity.SocialSectorAPIEntity;
import com.np.studentManagement.entity.TrainerDataApiEntity;
import com.np.studentManagement.entity.TrainerDataApiRepository;
import com.np.studentManagement.entity.TrainingPartnerApiRepo;
import com.np.studentManagement.entity.student;
import com.np.studentManagement.entity.subject;
import com.np.studentManagement.entity.teacher;
import com.np.studentManagement.repository.Schemewise_API_Repo;
import com.np.studentManagement.repository.SocialSectorApiRepository;
import com.np.studentManagement.service.service;

import net.minidev.json.JSONArray;
import net.minidev.json.JSONObject;
import net.minidev.json.parser.JSONParser;
import net.minidev.json.parser.ParseException;

@RestController
public class controller {
	
	private static Logger LOGGER= LogManager.getLogger(controller.class);
	
	@Value("${schemewiseAPI.URL}")
	private String schemewiseAPI_URL ;
	
	@Value("${socialSectorAPI.URL}")
	private String socialSectorAPI_URL;
	
	private String CostCatogeries_URL="https://reports.skillindia.gov.in/contentserver/services/content/analytics/an386bafba-f8cf-4b67-b3b0-0a40f4768a98/json?&t=737e7f30-3e4f-41ca-8319-9d9106bffdcd";
	
	@Autowired
	private SocialSectorApiRepository socialSectorApiRepository;

	@Autowired
	private service ser;
	
	@Autowired
	private Schemewise_API_Repo schemewise_API_Repo;
	
	@Autowired
	private TrainingPartnerApiRepo trainingPartnerApiRepo;
	
	@Autowired
	private CostCategoryApiRepo costCategoryApiRepo;
	
	@Autowired
	private TrainerDataApiRepository trainerDataApiRepository;
	
	
	
	@PostMapping("/saveStudent")
	public student saveStudent(@Valid @RequestBody student st)
	{
		return ser.saveStudentData(st);
	}
	
	@PostMapping("/saveTeacher")
	public teacher saveTeacher(@Valid @RequestBody teacher dto)
	{
		return ser.saveTeacherData(dto);
	}
	
	@PostMapping("/saveSubject")
	public subject saveSubject(@Valid @RequestBody subject sub)
	{
		return ser.saveSubjct(sub);
	}
	
	@PostMapping("/getTeacher")
	public List<teacher> getTeacher()
	{
		return ser.getTeacher();
	}
	
	@PostMapping("/getTeacherById")
	public Optional<teacher> getTeacherById(@RequestBody teacherId teacherId)
	{
		return ser.getTeacherById(teacherId);
	}
	
	@PostMapping("/getStudent")
	public List<student> getStudent()
	{
		return ser.getStudent();
	}
	
	@PostMapping("/getStudentByIdRollNo")
	public List<Object> getStudentByRollNo(@RequestBody studentId studentid)
	{
		return ser.getStudentByRollNo(studentid);
	}
	
	@PostMapping("/updateStudent")
	public String updateStudent(@RequestBody student std)
	{
		return ser.updateStudent(std);
	}
	
	@PostMapping("/updateTeacher")
	public String updateTeacher(@RequestBody teacher tech)
	{
		return ser.updateTeacher(tech);
	}
	
	@PostMapping("/updateSubject")
	public String updateSubject(@RequestBody subject sub)
	{
		return ser.updateSubject(sub);
	}
	
	@PostMapping("/test/{a}/{b}")
	public int test(@PathVariable int a, @PathVariable int b) throws ResourceNotFound
	{
		try {
			return a/b;
		}
		catch(Exception e)
		{
			throw new ResourceNotFound("divisible by zero");
		}
	}
	
	@Scheduled(fixedRate = 1000000)
	public String test() throws JsonMappingException, JsonProcessingException, ParseException  {
		
		schemewiseAPI();
		//socialSectorAPI();
		//Trainingpatne();
		//costCatogeries();
		return null;
		
	}
	
	private void costCatogeries() {
		
		System.out.println(CostCatogeries_URL);
		RestTemplate restTemplate = new RestTemplate();
		System.out.println("CostCatogeries_URL"+"........................");
		
		//socialSectorApiDto CostCatogeries =restTemplate.postForObject("https://reports.skillindia.gov.in/contentserver/services/content/analytics/an0dcaec67-4765-495c-aef4-21da664e938c/json?&t=737e7f30-3e4f-41ca-8319-9d9106bffdcd", null, socialSectorApiDto.class);
		RequestDto CostCatogeries =restTemplate.postForObject("https://reports.skillindia.gov.in/contentserver/services/content/analytics/an0dcaec67-4765-495c-aef4-21da664e938c/json?&t=737e7f30-3e4f-41ca-8319-9d9106bffdcd", null,RequestDto.class);
		System.out.println("length  :-"+CostCatogeries.getJson_data().size());
		
		for(int i=0;i<3;i++)
		{
			System.out.println(CostCatogeries.getJson_data().get(i).toString());
		}
//		//List<TrainerDataApiEntity> DB=trainerDataApiRepository.findAll();
//		for(int i=0;i<CostCatogeries.getJson_data().size();i++)
//		{
//			int count=0;
//			for(int j=0;j<CostCatogeries.getJson_data().size();j++)
//			{
//					if(CostCatogeries.getJson_data().get(i).getPhoneNumber().equals(CostCatogeries.getJson_data().get(j).getPhoneNumber()) &&
//							CostCatogeries.getJson_data().get(i).getCentre().equals(CostCatogeries.getJson_data().get(j).getCentre()) && 
//							CostCatogeries.getJson_data().get(i).getTrade().equals(CostCatogeries.getJson_data().get(j).getTrade()) &&
//							//CostCatogeries.getJson_data().get(i).getDOJ().equals(CostCatogeries.getJson_data().get(j).getDOJ()) &&
//							CostCatogeries.getJson_data().get(i).getDistrictCode().equals(CostCatogeries.getJson_data().get(j).getDistrictCode()) &&
//							CostCatogeries.getJson_data().get(i).getSector().equals(CostCatogeries.getJson_data().get(j).getSector()) &&
//							CostCatogeries.getJson_data().get(i).getFirstName().equals(CostCatogeries.getJson_data().get(j).getFirstName()))
//					{
//						count++;
//					}
//				
//			}
//			if(count>1)
//			{
//				System.out.println("more than one find  "+CostCatogeries.getJson_data().get(i).toString());
//			}
//		}
//		//trainerDataApiRepository.deleteAll();
//		//trainerDataApiRepository.saveAll(CostCatogeries.getJson_data());
//		System.out.println("Missin pass");
//		
//	}
//
//	private void socialSectorAPI() {
//		
//		System.out.println(socialSectorAPI_URL);
//		RestTemplate restTemplate = new RestTemplate();
//		System.out.println("socialSectorAPI"+"........................");
//		
//		socialSectorApiDto SocialSectorApiDto =restTemplate.postForObject(socialSectorAPI_URL, null, socialSectorApiDto.class);
//		System.out.println("length  :-"+SocialSectorApiDto.getJson_data().size());
//		
//		for(int i=0;i<3;i++)
//		{
//			System.out.println(SocialSectorApiDto.getJson_data().get(i).toString());
//		}
		
		//socialSectorApiRepository.saveAll(SocialSectorApiDto.getJson_data());
		
	}

	public void schemewiseAPI() 
	{
		
		AppCode sourceCode= AppCode.App001;
		System.out.println(sourceCode.getStatusCode()+"     "+sourceCode.getStatusDesc());
//		LOGGER.info("this is info");
//		LOGGER.debug("this is info");
//		LOGGER.error("this is info");
//		LOGGER.warn("this is info");
////		int temp=0;
//		System.out.println(schemewiseAPI_URL);
//		RestTemplate restTemplate = new RestTemplate();
//		System.out.println("kjfdh.......................................");
//		Schemewise_API_Entity[] requestDto = restTemplate.getForObject(schemewiseAPI_URL, Schemewise_API_Entity[].class);
//		SocialSectorAPIEntity[] requserDto2= restTemplate.getForObject(socialSectorAPI_URL,SocialSectorAPIEntity[].class);
		
//		System.out.println("Length----"+requestDto.length);
//		
//		for(int i=0;i<requestDto.length;i++)
//		{
//			System.out.println(requestDto[i]);
//			System.out.println(requestDto[i]);
//		}
		
		
//     	/System.out.println(requestDto.getJson_data().size());
//     	
//     	//List<String> distic_code=requestDto.getJson_data().stream().map(t -> t.getDistrictCode()).collect(Collectors.toList());
//     	//System.out.println(distic_code);
//     	System.out.println(":::::-----"+requestDto.getJson_data().get(1).toString());
     	
     	
     	//requestDto.getJson_data().stream().filter(emp -> requestDto.getJson_data().size() < 3).collect(Collectors.toList());
     	
     	//System.out.println(requestDto.getJson_data().stream().filter(emp -> emp.getNsdc_schemew_id() < 16 && requestDto.getJson_data().size()<3).collect(Collectors.toList()));
     	
//     	List<Integer> restApiHashCode=new ArrayList<>();
//     	for(int i=0;i<requestDto.getJson_data().size();i++)
//     	{
//     		restApiHashCode.add(requestDto.getJson_data().get(i).hashCode());
//     	}
     	
//     	RequestDto requestDtoDB=new RequestDto();
//     	requestDtoDB.setJson_data(schemewise_API_Repo.findAll());
//     	List<Integer> restApiHashCodeDB=new ArrayList<>();
//     	for(int i=0;i<requestDtoDB.getJson_data().size();i++)
//     	{
//     		restApiHashCodeDB.add(requestDtoDB.getJson_data().get(i).hashCode());
//     	}
     	
//     	for(int i=0;i<requestDto.getJson_data().size();i++)
//     	{
//     		for(int j=0;j<requestDtoDB.getJson_data().size();j++)
//     		{
//     			if(requestDto.getJson_data().get(i).hashCode()==requestDtoDB.getJson_data().get(j).hashCode())
//     			{
//     				System.out.println("inside check hash code");
//     				break;
//     			}
//
//     			if(requestDto.getJson_data().get(i).getSchemeName().equals(requestDtoDB.getJson_data().get(j).getSchemeName()) &&
//     					requestDto.getJson_data().get(i).getDistrictCode().equals(requestDtoDB.getJson_data().get(j).getDistrictCode()) &&
//     					requestDto.getJson_data().get(i).getFinancialYear().equals(requestDtoDB.getJson_data().get(j).getFinancialYear()))
//     			{
//     				System.out.println("inside updation  "+i+" j "+j);
//     				requestDto.getJson_data().get(i).setNsdc_schemew_id(requestDtoDB.getJson_data().get(j).getNsdc_schemew_id());
//     				schemewise_API_Repo.save(requestDto.getJson_data().get(i));
//     				break;
//     			}
//     			if(j==requestDtoDB.getJson_data().size()-1) {
//     				System.out.println("creation");
//     				this.schemewise_API_Repo.save(requestDto.getJson_data().get(i));}
//     		}
//     	}
     	
     	
     	
     	
     	
     	
     	
     	//schemewise_API_Repo.saveAll(requestDto.getJson_data());
     	
     	
//     	for(int i=0;i<3;i++)
//     	{
//     		Optional<Schemewise_API_Entity> schemewise_API_Entity=schemewise_API_Repo.findBySchemeNameStateCodeFinancialYear
//     				(requestDto.getJson_data().get(i).getSchemeName(),requestDto.getJson_data().get(i).getDistrictCode(),
//     						requestDto.getJson_data().get(i).getFinancialYear());
//     		if(!schemewise_API_Entity.isPresent())
//     			schemewise_API_Repo.save(requestDto.getJson_data().get(i));
//     		else
//     		{
//     			requestDto.getJson_data().get(i).setNsdc_schemew_id(schemewise_API_Entity.get().getNsdc_schemew_id());;
//     			System.out.println("enti"+schemewise_API_Entity.get());
//     			requestDto.getJson_data().set(i, schemewise_API_Entity.get());
//     			System.out.println("After :"+requestDto.getJson_data().get(i));
//     		}
//     			
//     	}
     	
     	System.out.println("done");
     	
     	//List<Schemewise_API_Entity> requestDtoInternal= schemewise_API_Repo.findAll();
     	//System.out.println();
     	
     	//requestDtoInternal.stream().forEach(t -> System.out.println(t.toString()));
     	
     	
     	
     	
     	
     	
     	
     	
//		String st = restTemplate.postForObject(URL,	null, String.class);
//		JSONParser parser = new JSONParser();
//		JSONParser parser2 = new JSONParser();  
//		JSONObject jsonObject = (JSONObject) parser2.parse(st);
//		String groupObje = jsonObject.getAsString("json_data");
//		JSONArray groupObject = (JSONArray) parser.parse(groupObje);
//	    System.out.println(groupObject.size());
//	    System.out.println(groupObject.get(0));
	    
	}
	
}
