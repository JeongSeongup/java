package chapter06.Question.Coffee;

public class Latte {
    String Menu; // 메뉴
    int Money; // 금액

    public Latte(String Menu){
        this.Menu = Menu;
        // 메뉴를 매개변수로 받는 생성자
    }

    public void take(int Money){
        this.Money += Money;
    }

    public void showInfo(){
        System.out.println(Menu+"의 값은"+Money+"입니다.");
    }
}
