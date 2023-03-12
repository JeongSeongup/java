package chapter06.staticex;

public class student1_test {
    public static void main(String[] args) {
        student1 studentLee = new student1();
        studentLee.setStudentName("이지원");
        System.out.println(studentLee.serialNum);
        System.out.println(studentLee.StudentName+"학번:"+studentLee.StudentID);
    
        student1 studentkim = new student1();
        studentkim.setStudentName("손수경");
        System.out.println(studentkim.serialNum);
        System.out.println(studentkim.StudentName+"학번:"+studentkim.StudentID);
    }
}
