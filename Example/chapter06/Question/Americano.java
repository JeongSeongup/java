package chapter06.Question;

public class Americano {
    String MenuName;
    int Money;

    public Americano(String MenuName){
        this.MenuName = MenuName;
    }

    public void Buy(int Money){
        this.Money += Money;
    }

    public void showiInfo(){
        System.out.println(MenuName+"결제금액은"+Money+"입니다.");
    }
}
