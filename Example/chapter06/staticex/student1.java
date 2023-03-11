package chapter06.staticex;

public class student1 {
    public static int serialNum = 100;
    public int StudentID;
    public String StudentName;
    public int grade;
    public String address;

    public student1(){
        serialNum++; // 학생이 생성될 때마다 증가
        StudentID = serialNum; // 증가된 값을 학번 인스턴스 변수에 부여
    }

    public String getSudentname(){
        return StudentName;
    }

    public void setStudentName(String name){
        StudentName = name;
    }
}
