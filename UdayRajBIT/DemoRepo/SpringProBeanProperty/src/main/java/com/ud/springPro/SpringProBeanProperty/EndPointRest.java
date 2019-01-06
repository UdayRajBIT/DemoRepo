package com.ud.springPro.SpringProBeanProperty;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EndPointRest {
	
	@Autowired
	Student student;
	
	@RequestMapping(value= {"/getCall"},method= {RequestMethod.GET})
	public Student getcall() {
		
		return student;
	}

}
