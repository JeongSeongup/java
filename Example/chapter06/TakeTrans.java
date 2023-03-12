package chapter06;

public class TakeTrans {
    public static void main(String[] args) {
        Student studentjames = new Student("james", 5000);
        Student studentkim = new Student("kim", 15000);
  

    Bus bus100 = new Bus(100);
    studentjames.takebus(bus100);
    studentjames.showInfo();
    bus100.ShowInfo();

    Subway subwayGreen = new Subway("2호선");
    studentkim.takeSubway(subwayGreen);
    studentkim.showInfo();
    subwayGreen.showInfo();

    }
}