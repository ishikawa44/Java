package group44.Project;

import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class ProjectApplication {

	public static void main(String[] args) throws Throwable {

		SpringApplication.run(ProjectApplication.class, args);
	}

}


