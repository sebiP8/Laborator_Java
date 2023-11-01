
    public class Course {
    private String name;
    private String description;
    private Professor teacher;
    private Student[] students;
    private double[] grades; // Added grades array

    public Course(String name, String description, Professor teacher, Student[] students) {
        this.name = name;
        this.description = description;
        this.teacher = teacher;
        this.students = students;
        this.grades = new double[students.length]; // Initialize grades array
    }

    public void addStudent(Student student) {
        // Your code to add a student to the course's student array
    }

    public String getName() {
        return name;
    }

    public Professor getTeacher() {
        return teacher;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setGrades(double[] grades) {
        this.grades = grades;
    }

    public double calculateAverageGrade() {
        if (grades.length == 0) {
            return 0.0;
        }
        double totalGrade = 0.0;
        for (double grade : grades) {
            totalGrade += grade;
        }
        return totalGrade / grades.length;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder("Course: name=" + name + ", description=" + description + "\nTeacher=" + teacher + "\nStudents:\n");
        for (Student student : students) {
            str.append(student).append("\n");
        }
        return str.toString();
    }
}








