package com;

import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan(basePackages="com.test")
@SpringBootTest
class ProjectApplicationTests {

	@Test
	void contextLoads() {
	}

}
