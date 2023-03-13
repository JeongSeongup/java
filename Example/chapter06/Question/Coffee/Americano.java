package chapter06.Question.Coffee;

public class Americano {
    int Money;
    String Menu;


    public Americano(String Menu){
        this.Menu = Menu;
        // 메뉴를 매개변수로 받는 생성자
    }
    public void Buy(int Money){
        this.Money += Money;

        // 사람이 아메리카노는 구매를 한 경우를 구현한 메서드
    }

    public void showInfo(){
        System.out.println("아메리카노 의 값은"+Menu+"입니다.");
        // 구매 정보를 ㅜㄹ력하는 메서드
    }
}
