package chapter04.Question;
// 1~100까지의 수중 3의 배수를 출력하시오
public class Question3 {
    public static void main(String[] ages){
        int num;
        for(num=1; num <= 100; num++){
            if( num % 3 == 0 )
            continue;
        System.out.println(num);
        }
    }
}
