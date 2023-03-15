package chapter07;

public class objectCopy1 {
    public static void main(String[] args) {
        book[] bookarray1 = new book[3];
        book[] bookarray2 = new book[3];

        bookarray1[0] = new book("태백산백1","조정래");
        bookarray1[1] = new book("태백산백2","조정래");
        bookarray1[2] = new book("태백산백3","조정래");
        
        bookarray1[0] = new book("태백산백4","조정래");
        bookarray1[1] = new book("태백산백5","조정래");
        bookarray1[2] = new book("태백산백6","조정래");

        for(int i=0; i<bookarray2.length; i++){
            System.out.println(bookarray2[i]);
        }
    }
}
