package chapter04.lean;
//opeator 값이 +,-,*,/ 인 경우에 사칙연산을 수행하는 프로그램을
// if-else문과 swich-case문을 사용해 작성해보시오
public class lean1 {
    public static void main(String[] args){
        int num1 = 10;
        int num2 = 2;

        char opeator = '+';

        switch(opeator){
            case 1 : opeator ='+';
            case 2 : opeator ='-';
            case 3 : opeator ='*';
            default : opeator='/';
        }
        System.out.println(opeator);
        System.out.println(num1+opeator+num2+"="+(num1+num2));

    }
}
