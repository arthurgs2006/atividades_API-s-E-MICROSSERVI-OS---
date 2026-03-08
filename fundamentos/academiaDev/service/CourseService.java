package academiaDev.service;

import academiaDev.model.Course;
import java.util.*;

public class CourseService {
    public class CourseService(Map<String, Course> courses){
    this.courses = courses;
    }
    public void changeStatus(String title, String status){
        Course c = courses.get(title);

        if(c != null){
            c.setStatus(status);
        }
    }
    public Collection<Course> listCourses(){
        return courses.values();
    }
}

