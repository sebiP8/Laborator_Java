import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CourseManager {
    private Course[] courses;

    public CourseManager() {
        courses = new Course[0];
    }

    public void addCourse(Course course) {
        int newLength = courses.length + 1;
        Course[] aux = Arrays.copyOf(courses, newLength);
        aux[newLength - 1] = course;
        courses = aux;
    }

    public void enrollStudentInCourse(String courseName, Student student) {
        for (Course course : courses) {
            if (course.getName().equals(courseName)) {
                course.addStudent(student);
                return; // Student enrolled, exit the loop
            }
        }
        // Handle the case where the course with the specified name was not found
        System.out.println("Course '" + courseName + "' not found.");
    }

    public List<Student> listStudentsInCourse(String courseName) {
        List<Student> enrolledStudents = new ArrayList<>();
        for (Course course : courses) {
            if (course.getName().equals(courseName)) {
                enrolledStudents.addAll(Arrays.asList(course.getStudents()));
            }
        }
        return enrolledStudents;
    }

    public double getAverageGradeForCourse(String courseName) {
        for (Course course : courses) {
            if (course.getName().equals(courseName)) {
                return course.calculateAverageGrade();
            }
        }
        return 0.0; // Return 0 as the default if the course is not found or has no grades.
    }

    public double getProfessorAverageGrade(String professorFullName) {
        double totalGrade = 0.0;
        int totalCourses = 0;

        for (Course course : courses) {
            if (course.getTeacher().getFullName().equals(professorFullName)) {
                totalGrade += course.calculateAverageGrade();
                totalCourses++;
            }
        }

        if (totalCourses > 0) {
            return totalGrade / totalCourses;
        } else {
            return 0.0; // Return 0 if the professor has no courses or grades.
        }
    }

    public void displayCoursesToConsole() {
        for (Course course : courses) {
            System.out.println(course);
        }
    }
}