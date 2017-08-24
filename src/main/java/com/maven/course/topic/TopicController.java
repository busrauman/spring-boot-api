package com.maven.course.topic;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	
	@RequestMapping("topics")
	public List<Topic> getTopics() {
		return Arrays.asList(
				new Topic("topic_id", "topic,name","topic_description")
				//otomatik olarak bu method un dönüş değeri json a çevrilir ve json çıktısı alırız.
				//bunu restController annotation'u sağlar 
				);
				
				
	}
	
}
