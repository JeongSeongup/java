package chapter06;

public class Subway {
    String lineNumber;
    int passengercount;
    int money;

    public Subway(String lineNumer){
        this.lineNumber =lineNumer;
    }
    public void take(int money){
        this.money += money;
        passengercount++;
    }
    public void showInfo(){
        System.out.println(lineNumber+"의 승객은"+passengercount+"명 이며 수입은" +money+"입니다.");
    }
}
