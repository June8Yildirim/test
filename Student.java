public class Student extends Person{
private String grade;

    public String getGrade() {
        return grade;
    }


    @Override
    public String toString() {
        return "Student{" +
                "firstname='" + firstname + '\'' +
                '}';
    }

    public Student(String fname, String lname, int age, String grade) {
        super(fname, lname,age);
        this.grade=grade;
    }

}
