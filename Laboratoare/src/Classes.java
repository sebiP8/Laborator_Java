public class Classes {
    public static void main(String[] args) {
        Student[] students = new Student[]{
                new Student("Andrei", "Negoita", 2231),
                new Student("Ion", "Mateescu", 4221)
        };

        Professor prof = new Professor("Anton", "Panaitscu");

        Course course = new Course("Material Resistance",
                "Calculations of reactions, effort diagrams, calculations of geometric characteristics of flat surfaces and calculations of resistance elements to simple stresses",
                prof, students);

        CourseManager courseManager = new CourseManager();
        courseManager.addCourse(course);

        // Display courses to the console
        courseManager.displayCoursesToConsole();

        // Enroll a student in a course
        Student newStudent = new Student("Mihai", "Popescu", 1111);
        courseManager.enrollStudentInCourse("Material Resistance", newStudent);

        // Display courses to the console after enrolling the new student
        courseManager.displayCoursesToConsole();

        // Calculate and display the average grade for a specific course
        course.setGrades(new double[]{8.5, 9.0, 7.5}); // Assign grades to the course
        System.out.println("Average grade for Material Resistance: " + courseManager.getAverageGradeForCourse("Material Resistance"));

        // Calculate and display the average grade given by a specific professor
        courseManager.addCourse(new Course("Physics", "Introductory physics course", prof, students));
        System.out.println("Average grade given by Professor Anton Panaitscu: " + courseManager.getProfessorAverageGrade("Anton Panaitscu"));
    }
}