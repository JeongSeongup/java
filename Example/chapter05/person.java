package chapter05;

public class Person {
    String name; // 이름
    float height; // 키
    float weight; // 몸무게

    public Person() {
    } // 디폴트 생성자

    public Person(String pname) {
        name = pname; // 이름을 매개변수로 입력받는 생성자
    }

    public Person(String pname, float pheight, float pweight) {
        name = pname;
        height = pheight;
        weight = pweight;
        // 이름, 키, 몸무게를 매개변수로 입력 받는 생성자
    }
}

// commit