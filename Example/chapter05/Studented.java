package chapter05;

public class Studented {
    int studentID;
    String studentName;
    int grade;
    String address;

    // public void ShowStudentInfo(){
    //     System.out.println(studentName+","+address);
    // }

    public String getStudentName(){
        return studentName;
        // 학생이름을 반화하는 메서드
    }

    public void setStudentName(String name){
        studentName = name;
        // 학생이름을 부여하는 메서드
    }

    public static void main(String[] args){
        Studented studentAhn = new Studented(); //Student Class 생성
        studentAhn.studentName = "안연수";

        System.out.println(studentAhn.studentName);
        System.out.println(studentAhn.getStudentName());
    }

}
