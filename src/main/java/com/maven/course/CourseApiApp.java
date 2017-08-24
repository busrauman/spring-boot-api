package com.maven.course;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // bu annotation bunun bir main metodu barındıran class olacağını söyler
					   // stand alone uygulamadır.
public class CourseApiApp {

	
		public static void main(String[] args) {
			SpringApplication.run(CourseApiApp.class, args);
		}
}
