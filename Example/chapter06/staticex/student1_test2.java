package chapter06.staticex;
// class  이름으로 변수 참조하기
public class student1_test2 {
    public static void main(String[] args) {
        student1 studentLee = new student1();
        studentLee.setStudentName("이지원");
        System.out.println(student1.serialNum);
        System.out.println(studentLee.StudentName+"학번:"+studentLee.StudentID);

        student1 studentson = new student1();
        studentson.setStudentName("손수경");
        System.out.println(student1.serialNum);
        System.out.println(studentson.StudentName+"학번:"+studentson.StudentID);
    }
}
