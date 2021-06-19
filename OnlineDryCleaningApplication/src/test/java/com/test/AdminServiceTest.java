package com.test;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.dao.IAdminRepository;
import com.service.IAdminService;

@SpringBootTest
public class AdminServiceTest {
	
	@Autowired
	IAdminService iadminservice;
	
	@MockBean
	IAdminRepository arepo;
	
	
	@Test
	void testregisterAdmin() {
		
		
	}

}
