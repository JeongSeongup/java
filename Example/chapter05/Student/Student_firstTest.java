package chapter05.Student;

public class Student_firstTest {
    public static void main(String[] args){
        Student studentLee = new Student(); // 생성자
        studentLee.getStudentName("이상원"); // SetStudentName()메서드를 활용해 Private 변수에 접근 가능

        System.out.println(studentLee.getStudentName()); 
    }
}
