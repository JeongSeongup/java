package chapter06.Question;
// 아침에 출근길에 김 씨는 4,000원을 내고 별다방에서 아메리카노를 사마셨습니다.
// 이 씨는 콩다방에서 4,500원을 내고 라테를 사 마셨습니다. 06-02 객체 간의 협력을 참고하여 이 과정을 객체 지향으로 프로그래밍 해보세요.
public class Cperson {
    String personName;
    int buyMoney;
    String buyMenu;

    public Cperson(String personName, int buyMoney){
        this.personName = personName;
        this.buyMoney = buyMoney;
    }

    public void BuyAmericano(Americano americano){
        americano.Buy(4000);
        this.buyMoney -= 4000;
    }

    public void BuyLatte(Latte latte){
        latte.Buy(4500);
        this.buyMoney -= 4500;
    }

    public void showiInfo(){
        System.out.println(personName+"님의 구매금액"+buyMoney+"금액이 결제 되었습니다.");
    }
}

