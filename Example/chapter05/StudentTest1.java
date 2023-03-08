package chapter05;

public class StudentTest1 {
    public static void main(String[] args){
      Student student1 = new Student();
      student1.studentName = "안연수";

      Student student2 = new Student();
      student2.studentName = "안승연";

        System.out.println(student1.getStudentName());  // 인스턴스 사용하기
        System.out.println(student2.getStudentName());  // 인스턴스 사용하기

        System.out.println(student1); // 학생1 참조변수 값 출력
        System.out.println(student2); // 학생2 참조변수 값 출력
    }
}
