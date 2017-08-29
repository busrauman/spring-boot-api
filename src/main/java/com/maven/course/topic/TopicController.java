package com.maven.course.topic;

import java.util.Arrays;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.maven.course.services.TopicServices;

@RestController
public class TopicController {
	
	@Autowired
	private TopicServices service;
	
	
	@RequestMapping("/topics")
	public List<Topic> getTopics() {
		/*return Arrays.asList(
				new Topic("topic_id", "topic,name","topic_description")
				//otomatik olarak bu method un dönüş değeri json a çevrilir ve json çıktısı alırız.
				//bunu restController annotation'u sağlar 
				);
			*/
		/* return etdilen liste yi singleton gibi çalışan bir servis üzerinden elde edelim.
		 * 
		 */
			
		return service.getAllTopics();
		
	}
	
	@RequestMapping("/topics/{id}")
	public Topic getTopic(@PathVariable String id) {
		return service.getTopic(id);
	}
	
}
