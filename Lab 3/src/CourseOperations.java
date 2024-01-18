public interface CourseOperations {
    void updateProfessor(Professor p);
    void addStudent(Student student);
    void removeStudent(Student student);
    void updateStudent(Student student);
    void updateCourse(String name, String description);
}
