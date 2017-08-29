package com.maven.course.services;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.maven.course.topic.Topic;

@Service
public class TopicServices {
	
	List<Topic> topics = Arrays.asList(new Topic("spring","spring kursu","Spring acıklama"),
									new Topic("java","Java","Java kursu"));
	
	public List<Topic> getAllTopics(){
		return topics;
	}
	public Topic getTopic(String id) {
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}
}
