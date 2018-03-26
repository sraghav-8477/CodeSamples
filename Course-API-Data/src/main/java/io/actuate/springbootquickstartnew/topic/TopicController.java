package io.actuate.springbootquickstartnew.topic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {

	@Autowired
	private TopicService topicService;
	
	@RequestMapping("/topics")
	public List<Topic> getAllTopic() {
		
		return topicService.getAllTopics();
		
	}
	
	@RequestMapping("/topics/{Id}")
	public Topic getTopic(@PathVariable("Id") String Id) {
		return topicService.getTopic(Id);
	}
	@RequestMapping(method=RequestMethod.POST,value="/topics")
	public Topic addTopic(@RequestBody Topic topic) {
		
		return topicService.addTopic(topic);
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/topics/{Id}")
	public Topic updateTopic(@RequestBody Topic topic,@PathVariable("Id") String id) {
		
		return topicService.updateTopic(topic,id);
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="/topics/{Id}")
	public void removeTopic(@PathVariable("Id") String id) {
		
		topicService.removeTopic(id);
	}
	
}
