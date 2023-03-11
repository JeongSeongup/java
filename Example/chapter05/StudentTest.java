package chapter05;

public class StudentTest {
    public static void main(String[] args){
        Studented studentAhn = new Studented();
        studentAhn.studentName = "안승연";

        System.out.println(studentAhn.studentName);
        System.out.println(studentAhn.getStudentName());
    }
}
