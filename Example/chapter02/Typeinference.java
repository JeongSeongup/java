package chapter02;

public class Typeinference {
    public static void main(String[] args){
        var i = 10;
        var j = 10.0;
        var str = "hello";

        System.out.println(i);
        System.out.println(j);
        System.out.println(str);

        str="Test";
        // str=3 ;  Str변수는 String형으로 먼저 사용되었기 때문에 정수 값을 넣을 수 없음. 
    }
}
