package chapter07;

public class bookArray2 {
    public static void main(String[] args) {
        book [] library = new book[5];
        
        library[0]= new book("0","0");
        library[1]= new book("1","0");
        library[2]= new book("2","2");
        library[3]= new book("3","3");
        library[4]= new book("4","4");

        for(int i=0; i < library.length; i++){
            library[i].ShowBookInfo();
        }

        for(int i=0; i<library.length;i++){
            System.out.println(library[i]);
        }
    }
}
