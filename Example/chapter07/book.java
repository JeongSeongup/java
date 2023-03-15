package chapter07;

public class book {
    private String bookName;
    private String author;

    public book(){}

    public book(String bookName, String author){
        this.bookName = bookName;
        this.author = author;

    }

    public String GetBookName(){
        return bookName;
    }

    public String Getauthor(){
        return author;
    }

    public void SetAuto(String author){
        this.author = author;
    }

    public void ShowBookInfo(){
        System.out.println(bookName+","+author);
    }
}
