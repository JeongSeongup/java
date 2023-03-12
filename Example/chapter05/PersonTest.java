package chapter05;

public class PersonTest{
    public static void main(String[] args){
        Person kimPerson = new Person();
        kimPerson.name = "김유신";
        kimPerson.weight = 85.55F;
        kimPerson.height = 178.8F;

        Person personlee = new Person("이순신", 175, 75);
        System.out.println(kimPerson.weight);
        System.out.println(personlee.height);
    }

    
}