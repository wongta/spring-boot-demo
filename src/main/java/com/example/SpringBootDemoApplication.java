package com.example;

import com.example.demo.config.AuthorSettings;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@SpringBootApplication
public class SpringBootDemoApplication {

//	@Value("${book.author}")
//	private String bookAuthor;
//
//	@Value("${book.name}")
//	private String bookName;

	@Resource
	private AuthorSettings authorSettings;

	@RequestMapping("/")
	String index()
	{
		return "book name is:" + authorSettings.getName() + " and book author is :" + authorSettings.getAge();
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemoApplication.class, args);
	}
}
