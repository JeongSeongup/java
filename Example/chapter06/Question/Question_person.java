package chapter06.Question;
// 아침에 출근길에 김 씨는 4,000원을 내고 별다방에서 아메리카노를 사마셨습니다.
// 이 씨는 콩다방에서 4,500원을 내고 라테를 사 마셨습니다. 06-02 객체 간의 협력을 참고하여 이 과정을 객체 지향으로 프로그래밍 해보세요.
public class Question_person {
    public static void main(String[] args){
        Cperson personKim = new Cperson("personkim", 10000);
        Cperson personLee = new Cperson("personLee", 10000);
    }

    Americano americano1 = new Americano("Americano");
    personkim.BuyAmericano(americano1);
}

