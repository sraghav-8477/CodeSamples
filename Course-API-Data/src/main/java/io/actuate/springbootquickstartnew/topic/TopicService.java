package io.actuate.springbootquickstartnew.topic;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	@Autowired
	private TopicRepository topicRepository;
	
	public List<Topic> getAllTopics(){
		List<Topic> topics = new ArrayList<>();
		topicRepository.findAll().forEach(topics :: add);
		return topics;
	}
	
	public Topic getTopic(String Id) {
		
		return topicRepository.findOne(Id);
	}

	public Topic addTopic(Topic topic) {
		
		return topicRepository.save(topic);
	}

	public Topic updateTopic(Topic topic, String id) {
		
			
		return topicRepository.save(topic);
	}

	public void removeTopic(String id) {
		
		topicRepository.delete(id);
	}

}
