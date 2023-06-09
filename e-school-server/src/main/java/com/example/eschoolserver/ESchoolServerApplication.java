package com.example.eschoolserver;

import com.example.eschoolserver.model.Student;
import com.example.eschoolserver.model.User;
import com.example.eschoolserver.service.StudentService;
import org.apache.catalina.filters.CorsFilter;
import org.apache.ibatis.type.MappedTypes;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.Arrays;


@MappedTypes({Student.class, User.class})
@MapperScan("com.example.eschoolserver.mapper")
@SpringBootApplication
public class ESchoolServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ESchoolServerApplication.class, args);
	}
//	@Bean
//	CommandLineRunner run(StudentService studentService){
//		return args ->{
//			studentService.addStudent(new Student("Alimzhan Z.", 18, true, 3.85, 1, "alimzhan@gmail.com"));
//			studentService.addStudent(new Student("Danial D.", 20, true, 3.85, 3, "danial@gmail.com"));
//			studentService.addStudent(new Student("Amir T.", 20, true, 3.55, 3, "amir@gmail.com"));
//		};
//	}
}
