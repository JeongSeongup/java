package chapter02;

public class Constans {
    public static void main(String[] args){
        final int Max_Num = 100; // 선언과 동시에 초기화
        final int Min_num ; 
        
        Min_num = 0; // 사용 전 초기화 하지 않으면 오류발생

        System.out.println(Max_Num);
        System.out.println(Min_num);
    }
}
