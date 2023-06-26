package com.springbootstarter.topics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

 @Service
public class TopicService {
	
	@Autowired
	private TopicRepository topicRepo;
	
	
	
	public List<Topic> getAllTopics() {
		
		List<Topic> topics = new ArrayList<>();
		topicRepo.findAll().forEach(topics::add);
		
		

//		for( Topic t : topicRepo.findAll()) {
//			topics.add(t);
//		}
		
		return topics;
	}
	
	public Optional<Topic> getTopicbyId(String id) {
		
			
		return topicRepo.findById(id);
		
	}

	public void addTopic(Topic topic) {

		topicRepo.save(topic);
	}

	public void updateTopic(Topic topic, String id) {
		
		topicRepo.save(topic);	
		
	}	
	
	public void deleteTopic(String id) {
		
		topicRepo.deleteById(id);
	
	}

	public void addHardTopics() {

		List<Topic> topics = new ArrayList<>();
		
		topics.add(new Topic("101", "Mugen", "artist")); 		topics.add(new Topic("102", "lilly", "piano"));
		topics.add(new Topic("103", "karthikeyan", "s/w")); 		topics.add(new Topic("104", "mani", "piano"));

		
		topicRepo.saveAll(topics);
	}

	
}
