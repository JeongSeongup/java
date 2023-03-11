package chapter06.staticex;

public class student{
    public static int serialNum = 100;
    public int StudentID;
    public String Studentname;
    public int grade;
    public String address;

    public String getStudentName(){
        return Studentname;
    }

    public void setStudentName(String name){
        Studentname = name;
    }
}