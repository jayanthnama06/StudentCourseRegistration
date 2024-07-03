package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.modal.Course;

public interface CourseRepository extends JpaRepository<Course, Integer> {
    // You can add custom query methods here if needed
}

