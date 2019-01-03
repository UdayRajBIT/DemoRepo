package com.vtg.SpringProject.DemoSpringRest.Controller;


import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestEndpoint {
	
	
	
    @RequestMapping(value={"/postcall"}, method= {RequestMethod.POST},produces = { "application/json" })
	public Object getStudentDetails(@RequestBody String stu) {
		
		return stu;
	}
	

	@RequestMapping(value={"/getcall"}, method= {RequestMethod.GET})	
	public Object getStudentDetails() {
		
		return "{SUCCESS}";
	}
	
	
	@RequestMapping(value={"/test"}, method= {RequestMethod.GET})	
	public Object test() {
		
		return "{ test SUCCESS}";
	}

}
