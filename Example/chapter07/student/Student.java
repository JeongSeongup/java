package chapter07.student;
import java.util.ArrayList;

import javax.security.auth.Subject;

public class Student {
    int StudentID;
    String StudentName;
    ArrayList<Subject> subjectsList;

    public Student(int  StudentID, String StudentName){
        this.StudentID = StudentID;
        this.StudentName = StudentName;
        subjectsList = new ArrayList<Subject>(); // ArrayList 생성하시
    }

    public void addSubJect(String name, int Score){
        subject subject = new Subject();
        subject
    }
    
}
