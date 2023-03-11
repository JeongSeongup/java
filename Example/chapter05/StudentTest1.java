package chapter05;

public class StudentTest1 {
    public static void main(String[] args){
      Studented student1 = new Studented();
      student1.studentName = "안연수";

      Studented student2 = new Studented();
      student2.studentName = "안승연";

        System.out.println(student1.getStudentName());  // 인스턴스 사용하기
        System.out.println(student2.getStudentName());  // 인스턴스 사용하기

        System.out.println(student1); // 학생1 참조변수 값 출력
        System.out.println(student2); // 학생2 참조변수 값 출력
    }
}
