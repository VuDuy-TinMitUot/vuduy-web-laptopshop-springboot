package vn.vuduy.laptopshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// @SpringBootApplication

//Disable Security(Bảo mật login)
@SpringBootApplication(exclude = org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration.class)
public class VuduyWebLaptopshopSpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(VuduyWebLaptopshopSpringbootApplication.class, args);
	}

}
