package chapter06;
class Person{
    String Name;
    int Age;
 
    Person(){
        this("이름없음", 1);
    }

    Person(String name, int age){
        this.Name = name;
        this.Age = age;
    }
    
    Person retuenItself(){
        return this; // this 반환
    }
}

public class CallanotherConst {
   public static void main(String[] args) {
    Person noName = new Person();
    System.out.println(noName.Name);     
    System.out.println(noName.Age);
    
    Person P = noName.retuenItself();  //  this 값을 참조 변수에 대입
    System.out.println(P);              // NoName.returnItself()의 반환 값 출력
    System.out.println(noName);        // 참조변수 출력
    }   

}
