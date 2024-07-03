package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.modal.Course;
import com.example.repository.CourseRepository;

@Service
public class CourseService {

    private final CourseRepository courseRepository;

    @Autowired
    public CourseService(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    public String  addCourse(Course course) {
        courseRepository.save(course);
        
        return "added successfully";
    }

    // You can add more service methods here, such as fetching courses, updating, or deleting them.
    
    public List<Course> getAll() {
        return courseRepository.findAll();
    }
}

