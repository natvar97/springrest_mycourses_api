package com.indialone.springrest.services;

import java.util.List;

import com.indialone.springrest.dao.CourseDao;
import com.indialone.springrest.entities.Course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CoursesServiceImpl implements CoursesService {

//    List<Course> listOfCourses;
    @Autowired
    private CourseDao courseDao;

    public CoursesServiceImpl() {
/*
        listOfCourses = new ArrayList<>();
        listOfCourses.add(new Course(125, "Spring Course", "This is free course."));
        listOfCourses.add(new Course(126, "Android Course", "This is free course."));
*/
    }

    @Override
    public List<Course> getCourses() {
        return courseDao.findAll();
//        return listOfCourses;
    }

    @Override
    public Course getCourseById(long id) {
        return courseDao.getById(id);
        /*Optional<Course> course = listOfCourses.stream().filter(new Predicate<Course>() {
            @Override
            public boolean test(Course course) {
                return id == course.getId();
            }
        }).findFirst();
        return course.orElseGet(Course::new);*/
    }

    @Override
    public Course addCourse(Course course) {
        return courseDao.save(course);
        /*boolean isExists = isCourseExists(course);

        if (isExists) {
            return "Course with id: " + course.getId() + " is already exists. Try Update the course with same id";
        } else {
            listOfCourses.add(course);
            return "course successfully added";
        }*/
    }

    @Override
    public void deleteCourseById(long id) {
        courseDao.deleteById(id);
       /* boolean isExists = false;
        Course myCourse = new Course();
        for (Course c : listOfCourses) {
            if (c.getId() == id) {
                isExists = true;
                myCourse = c;
                break;
            }
        }
        if (isExists) {
            listOfCourses.remove(myCourse);
            return "Course successfully deleted";
        } else {
            return "Course with id: " + id + " not exists in database. Try add new course by this id";
        }*/
    }

    @Override
    public Course updateCourse(Course course) {
        return courseDao.save(course);
       /* boolean isExists = false;
        for (Course courseItem : listOfCourses) {
            if (courseItem.getId() == course.getId()) {
                isExists = true;
                courseItem.setTitle(course.getTitle());
                courseItem.setDescription(course.getDescription());
                break;
            }
        }
        if (isExists) {
            return "Course with id: " + course.getId() + " is updated";
        } else {
            return "Course with id: " + course.getId() + " is not available in database.";
        }*/
    }

/*    private boolean isCourseExistsById(long id) {
        boolean isExists = false;
        for (Course c : listOfCourses) {
            if (c.getId() == id) {
                isExists = true;
                break;
            }
        }
        return isExists;
    }*/
/*

    public boolean isCourseExists(Course course) {
        boolean isExists = false;
        for (Course c : listOfCourses) {
            if (c.getId() == course.getId()) {
                isExists = true;
                break;
            }
        }
        return isExists;
    }
*/

}
