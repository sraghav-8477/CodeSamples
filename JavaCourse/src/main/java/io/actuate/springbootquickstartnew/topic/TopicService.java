package io.actuate.springbootquickstartnew.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	
	List<Topic> topics = new ArrayList<>(Arrays.asList(new Topic("001","Java","Java Course Description"),
	new Topic("002","NET", ".NET Course Description"),
	new Topic("003","PHP", "PHP Course Description")));
	
	public List<Topic> getAllTopics(){
		
		return topics;
	}
	
	public Topic getTopic(String Id) {
		return topics.stream().filter(t-> t.getId().equals(Id)).findFirst().get();
	}

	public Topic addTopic(Topic topic) {
		topics.add(topic);
		return topic;
	}

	public Topic updateTopic(Topic topic, String id) {
		for(int i=0;i<topics.size();i++) {
			Topic t = topics.get(i);
			if(t.getId().equals(id)) {
				topics.set(i, topic);
			}
		}
		return topics.stream().filter(t-> t.getId().equals(id)).findFirst().get();
	}

	public Topic removeTopic(String id) {
		Topic topic = topics.stream().filter(t-> t.getId().equals(id)).findFirst().get();
		for(int i=0;i<topics.size();i++) {
			Topic t = topics.get(i);
			if(t.getId().equals(id)) {
				topics.remove(i);
			}
		}
		return topic;
	}

}
