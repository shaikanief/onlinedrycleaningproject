package com.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import com.drycleaning.bean.Admin;
import com.drycleaning.service.IAdminService;

@ContextConfiguration
class Admintest {
	@Autowired
	private IAdminService adminservice;
	
	
	@Test
	void test() {
		Admin a1=new Admin();
		a1.setUserId("Anief");
		equals(a1.equals("Anief"));	
	}

}
