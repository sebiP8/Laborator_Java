public class Student {
    private String firstName;
    private String lastName;
    private int groupNumber;

    public Student(String firstName, String lastName, int groupNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.groupNumber = groupNumber;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", groupNumber=" + groupNumber +
                '}';
    }
}