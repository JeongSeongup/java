package chapter06.Question.Coffee;
// 아침에 출근길에 김 씨는 4,000원을 내고 별다방에서 아메리카노를 사마셨습니다.
// 이 씨는 콩다방에서 4,500원을 내고 라테를 사 마셨습니다. 06-02 객체 간의 협력을 참고하여 이 과정을 객체 지향으로 프로그래밍 해보세요.
public class Person {
    public String personName; // 이름
    public int Money;   // 가지고 있는 금액
    public String Menu; // 구매할 메뉴

    public Person(String personName, int Money){
        this.personName = personName;
        this.Money = Money;
        // 구매자 이름과 구매 금액을 매개변수로 받는 생성자
    }

    public BuyAmericano (Americano americano){
        americano.Buy(4000);
        this.Money -= 4000;
        // 사람이 아메리카노를 구매하면 4,000원을 지불하는 기능을 구현한 메서드

    }

    public BuyLatte (Latte latte){
        latte.take(4500);
        this.Money -= 4500;
        // 사람이 라떼를 구매하면 4,500원을 지불하는 기능을 구현한 메서드

    }

    public void showInfo(){
        System.out.println(personName+"님의 남은 돈은"+Money+"입니다.");
        // 현재 정보를 출력하는 메서드 
    }
}