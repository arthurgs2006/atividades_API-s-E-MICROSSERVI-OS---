package academiaDev.service;

import academiaDev.exception.EnrollmentException;
import academiaDev.model.*;

public class EnrollmentService {

    public void enroll(Student student, Course course){

        if(!course.getStatus().equals("ACTIVE")){
            throw new EnrollmentException("Curso inativo.");
        }

        int active = student.getEnrollments().size();

        if(!student.getSubscriptionPlan().canEnroll(active)){
            throw new EnrollmentException("Plano não permite mais matrículas.");
        }

        boolean already = student.getEnrollments()
                .stream()
                .anyMatch(e -> e.getCourse().equals(course));

        if(already){
            throw new EnrollmentException("Aluno já matriculado.");
        }

        Enrollment enrollment = new Enrollment(student, course);

        student.getEnrollments().add(enrollment);
    }
}