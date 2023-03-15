package chapter07;

public class bookArray {
    public static void main(String[] args) {
        book[] library = new book[5];

        for(int i=0; i<library.length; i++){
            System.out.println(library[i]);
        }
    }
}
