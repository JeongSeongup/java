package chapter06.Question.Coffee;


public class BuyCoffee {
    public static void main(String[] args) {
        Person personkim = new Person("personKim", 10000);
        Person personLee = new Person("personLee", 10000);

        Americano americano1 = new Americano("Americano");
        personkim.BuyAmericano(americano1);
        personkim.showInfo();
        americano1.showInfo();


        Latte latte1 = new Latte("Latte");
        personLee.BuyLatte(latte1);
        personLee.showInfo();
        latte1.showInfo();
    }
}
