package io.actuate.springbootquickstartnew.course;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
	
	@Autowired
	private CourseRepository topicRepository;
	
	public List<Course> getAllCourses(String topicId){
		List<Course> courses = new ArrayList<>();
		topicRepository.findByTopicId(topicId).forEach(courses :: add);
		return courses;
	}
	
	public Course getCourse(String Id) {
		
		return topicRepository.findOne(Id);
	}

	public Course addCourse(Course topic) {
		
		return topicRepository.save(topic);
	}

	public Course updateCourse(Course topic) {
		
			
		return topicRepository.save(topic);
	}

	public void removeCourse(String id) {
		
		topicRepository.delete(id);
	}

}
