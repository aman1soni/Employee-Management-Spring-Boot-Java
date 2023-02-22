package com.nagarro.employeemgmtsprinboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//@ComponentScan({"com.nagarro.employeemgmtsprinboot"})
//@EntityScan("com.nagarro.employeemgmtsprinboot")
//@EnableJpaRepositories("com.nagarro.employeemgmtsprinboot")
public class EmployeeMgmtSprinBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeMgmtSprinBootApplication.class, args);
	}

}
