package chapter04.Question;
// Gender변수 값이 'F'인경우 '여성입니다.'라고 출력하고 그렇지않은경우 '남성입니다.'를 출력하세요.

public class Question1 {
    public static void main(String[] args){
        char gender = 'F';
        if (gender == 'F'){
            System.out.println("여성입니다.");
        }else{
            System.out.println("남성입니다.");
        }
    }    
}
