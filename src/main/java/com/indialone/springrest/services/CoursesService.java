package com.indialone.springrest.services;

import java.util.List;

import com.indialone.springrest.entities.Course;


public interface CoursesService {
    
    List<Course> getCourses();

    Course getCourseById(long id);

    Course addCourse(Course course);

    void deleteCourseById(long id);

    Course updateCourse(Course course);
}
