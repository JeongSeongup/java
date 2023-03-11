package chapter05.Student;

public class Student {
    int StudentID;
    private String studentName;
    int KoreaScore;
    int MathScore;


public String getStudentName(){
    return studentName;
}

public void getStudentName(String studentName){
    this.studentName = studentName;
}
}
