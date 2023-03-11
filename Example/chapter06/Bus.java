package chapter06;

public class Bus {
    int busNumber;
    int passengercount;
    int money;
    public Bus(int busNumber){
        this.busNumber = busNumber;
    }

    public void take(int money){
        this.money += money;    // 버스 수입 증가
        passengercount++;       // 승객 수 증가
    }

    public void ShowInfo(){
        System.out.println("버스"+busNumber+"번의 승객은"+passengercount+"명 이며 수입은"+money+"입니다.");
    }
}
