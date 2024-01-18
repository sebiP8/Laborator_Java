package classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CourseManager {
    Course[] courses;

    public CourseManager() {
        courses = new Course[0];
    }

    public void addCourse(Course course) {
        int newLength = courses.length + 1;
        Course[] aux = new Course[newLength];
        int index = 0;
        for (Course c : courses) {
            aux[index++] = c;
        }
        aux[index] = course;
        this.courses = aux; // Actualizare directă a array-ului
    }

    public void displayCoursesToConsole() {
        for (Course c : courses) {
            System.out.println(c);
        }
    }
}
