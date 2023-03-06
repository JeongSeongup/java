package chapter04;

public class NestedLoop {
    public static void main(String[] args){
        int dan;
        int itmes;

        for(dan=2; dan <= 9; dan++){
            for(itmes = 1; itmes <= 9; itmes++ ){
                System.out.println(dan+"X"+itmes+"="+dan*itmes);
            }
        }
    }
}
