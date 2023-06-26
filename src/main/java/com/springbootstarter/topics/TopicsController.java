package com.springbootstarter.topics;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicsController {
	
	@Autowired(required = false)
	private TopicService topicService;
	
	@RequestMapping("/topics")
	public List<Topic> topics()
	{
		
		
//		String string = "{\"name\": \"Sam Smith\", \"technology\": \"Python\"}";  
//		JSONObject json = new JSONObject(string);  
//		System.out.println(json.toString());  
//		String technology = json.getString("technology");  
//		System.out.println(technology);  
		
		
		return topicService.getAllTopics();
		
		
		//return "all topics";
	}

	
	
	@RequestMapping("/topics/{idVal}")
	public Optional<Topic> topicById(@PathVariable String idVal)
	{
		
		return topicService.getTopicbyId(idVal);
		
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/topics")
	public void addTopic(@RequestBody Topic topic) {
		
		topicService.addTopic(topic);		
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/topics/{idVal}")
	public void updateTopic(@RequestBody Topic topic, @PathVariable String idVal) {
		
		topicService.updateTopic(topic, idVal);		
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/topics/{idVal}")
	public void deleteTopic(@PathVariable String idVal) {
		
		topicService.deleteTopic(idVal);		
	}
	
	@PostMapping("/addHardtopics")
	public void addHards() {
		
		topicService.addHardTopics();		
	}
	
}
