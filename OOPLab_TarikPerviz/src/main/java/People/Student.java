package People;
import java.util.ArrayList;
import java.util.List;
public class Student extends Person {
    private int credits;
    private int student_id;
    private List<Integer> grades;

    public Student(String name, String address,int student_id) {
        super(name, address);
        this.credits = 0;
        this.student_id=student_id;
        this.grades=new ArrayList<>();
    }
    public int getStudentId() {
        return student_id;
    }

    public void setStudentId(int student_id) {
        this.student_id = student_id;
    }
    public void addGrade(int grade) {
        if (grade >= 1 && grade <= 10) {
            grades.add(grade);
        } else {
            System.out.println("Invalid grade: " + grade + ". Grades should be between 1 and 10.");
        }
    }

    public int credits() {
        return credits;
    }

    public void study() {
        credits++;
    }


    public String toString() {
        return super.toString ()+ "\nStudent ID: " + student_id + "\nGrades: " + grades + "\nCredits " + credits;
    }
}
