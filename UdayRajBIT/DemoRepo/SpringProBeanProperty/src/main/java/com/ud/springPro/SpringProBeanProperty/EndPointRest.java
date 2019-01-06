package com.ud.springPro.SpringProBeanProperty;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EndPointRest {
	
	@Autowired
	Student student;
	
	Logger logger=LoggerFactory.getLogger(EndPointRest.class);
	
	@RequestMapping(value= {"/getCall"},method= {RequestMethod.GET})
	public Student getcall() {
		
		logger.info("getCall celled: {}",student);
		System.out.println("Student:"+student.toString());
		return student;
	}

}
