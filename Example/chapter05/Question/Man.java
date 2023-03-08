package chapter05.Question;

// 나이가 40살 이름이 james라는 남자가 있습니다. 이 남자는 결혼을 했고 자식이 셋 있습니다.
public class Man{
    String ManName; // 이름
    int children; // 자식 수
    int age; // 나이
    boolean married; // 결혼여부

    public String getManName(){
        return ManName;
        // 학생이름을 반화하는 메서드
    }

    public void setManName(String name){
        ManName = name;
        // 학생이름을 부여하는 메서드
    }

    public static void main(String[] args){
        Man Man1 = new Man();

        Man1.ManName = "james";
        Man1.married = true;
        Man1.children = 3;
        Man1.age = 40;
        System.out.println(Man1.ManName+ Man1.children+","+ Man1.age+ Man1.married);
    }
    
}
