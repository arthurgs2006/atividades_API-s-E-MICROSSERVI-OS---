package academiaDev.main;

import academiaDev.model;
import academiaDev.service.*;
import academiaDev.support.SupportTicket;
import academiaDev.util.InitialData;

import java.util.*;

public class Main {
    public static void main(String[] args){
        Map<String, Course> courses = InitialData.loadCourses();
        Map<String, User> users = InitialData.loadUsers();
        Queue<SupportTicket> tickets = new ArrayDeque<>();

        CourseService courseService = new CourseService(courses);
        EnrollmentService enrollmentService = new EnrollmentService();
        SupportService supportService = new SupportService(tickets);
        ReportService reportService = new ReportService();

        Scanner sc = new Scanner(System.in);

        System.out.println("Seu e-mail para o login:")
        String email = sc.nextLine();

        User user = users.get(email);

        if (user == null){
            System.out.println("user not found (404)");
            return;
        }
        System.out.println("Welcome abord " + user.getName());
    }
}

