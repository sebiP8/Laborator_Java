public class Course implements CourseOperations {
    String name;
    String description;
    Professor teacher;
    Student[] students;

    public Course(String name, String description,
                  Professor teacher, Student[] students) {
        this.name = name;
        this.description = description;
        this.teacher = teacher;
        this.students = students;
    }

    public void addStudent(Student student) {
        int newLength = students.length + 1;
        Student[] aux = new Student[newLength];
        int index = 0;
        for (Student s : students) {
            aux[index++] = s;
        }

        aux[index] = student;
        this.students = new Student[newLength];
        System.arraycopy(aux, 0, students, 0, newLength);
    }

    public Student[] getEnrolledStudents() {
        return students;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder("Course: " + "name=" + name + ", description=" +
                description + ",\nTeacher=" + teacher + ",\nStudents:\n");
        for (Student s : students) {
            str.append(s).append("\n");
        }
        return str.toString();
    }

    @Override
    public void updateProfessor(Professor p) {
        this.teacher = p;
    }

    @Override
    public void addStudent(Student student) {
        // Implementează logica de adăugare a unui student
    }

    @Override
    public void removeStudent(Student student) {
        // Implementează logica de eliminare a unui student
    }

    @Override
    public void updateStudent(Student student) {
        // Implementează logica de actualizare a unui student
    }

    @Override
    public void updateCourse(String name, String description) {
        // Implementează logica de actualizare a numelui și descrierii cursului
    }
}
