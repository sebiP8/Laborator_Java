public class Student extends Person {
    int groupNumber;

    public Student(String name, String surname, int groupNumber) {
        super(name, surname);
        this.groupNumber = groupNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", groupNumber=" + groupNumber +
                '}';
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    public String getFullname() {
        return name + " " + surname;
    }
}
