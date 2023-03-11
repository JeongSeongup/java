package chapter06.staticex;

public class student_test {
    public static void main(String[] args) {
        student studentLee = new student();
        studentLee.setStudentName("이지원");
        System.out.println(studentLee.serialNum); // serialNum 초깃값 출력
        studentLee.serialNum++;

        student studenson = new student();
        studenson.setStudentName("손수경");
        System.out.println(studenson.serialNum);
        System.out.println(studentLee.serialNum); 
    }
}
