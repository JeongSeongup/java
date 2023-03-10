package chapter06;

public class Student {
    public String studenName; // 학년이름
    public int grade;         // 학년
    public int money;         // 학생이 가지고 있는 돈 


    public Student(String studenName, int money){
        this.studenName = studenName;
        this.money = money;
        // 학생 이름과 가진 돈을 매개변수로 받는 생성자
    }

    public void takebus(Bus bus){
        bus.take(1000);
        this.money -= 1000;
        // 학생이 버스를 타면 1,000원을 지불하는 기능을 구현한 메서드
    }

    public void takeSubway(Subway Subway){
        Subway.take(1500);
        this.money -= 1500;
        // 학생이 지하철을 타면 1,500원을 지불하는 기능을 구현한 메서드
    }

    public void showInfo(){
        System.out.println(studenName+"님의 남은 돈"+money+"입니다.");
    }
}
