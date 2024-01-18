public class CourseManager implements ManagerCourseOperations {
    Course[] courses;

    public CourseManager() {
        courses = new Course[0];
    }

    double grades[] = {7.6, 8.7, 9.3, 6.4, 8.1};
    double gradesProfessor[] = {7, 7.1, 7.2, 7.3, 7.8, 5.4};

    public void AddCourse(Course course) {
        int newLength = courses.length + 1;
        Course[] aux = new Course[newLength];
        int index = 0;
        for(Course c : courses) {
            aux[index++] = c;
        }
        aux[index] = course;
        this.courses = new Course[newLength];
        System.arraycopy(aux, 0, courses, 0, newLength);
    }

    public void enrollStudent(String courseName, Student student) {
        Course targetCourse = null;
        for(Course course : courses){
            if(course.name.equals(courseName)) {
                targetCourse = course;
                break;
            }
        }
        if(targetCourse != null){
            targetCourse.addStudent(student);
            System.out.println(student + " a fost inscris la " + courseName);
        }
        else System.out.println("Cursul cu numele " + courseName + " nu exista");
    }

    public Student[] listStudentsInCourse(String courseName) {
        Course targetCourse = null;
        for(Course course : courses) {
            if(course.name.equals(courseName)){
                targetCourse = course;
                break;
            }
        }
        if (targetCourse != null) {
            return targetCourse.getEnrolledStudents();
        } else {
            return new Student[0];
        }
    }

    public double calculateAverageGradeForCourse(String courseName) {
        Course targetCourse = null;
        for (Course course : courses) {
            if (course.name.equals(courseName)) {
                targetCourse = course;
                break;
            }
        }

        if (targetCourse != null) {
            if (grades.length > 0) {
                double sum = 0.0;
                for (double grade : grades) {
                    sum += grade;
                }
                return sum / grades.length;
            } else {
                System.out.println("Nu exista note pentru " + courseName);
                return 0.0;
            }
        } else {
            System.out.println("Cursul " + courseName + " nu exista.");
            return 0.0;
        }
    }

    public double calculateAverageProfessorGrade() {
        double sum = 0.0;
        for (double gradeProfessor : gradesProfessor) {
            sum += gradeProfessor;
        }

        return sum / gradesProfessor.length;
    }

    public void DisplayCoursesToConsole() {
        for (Course c : courses) {
            System.out.println(c);
        }
    }

    public void UpdateCourse(Course course) {
        System.out.println("Update Course");
        // Implementează logica de actualizare a cursului
    }

    public void DeleteCourse(Course course) {
        System.out.println("Deleted Course");
        // Implementează logica de ștergere a cursului
    }
}

