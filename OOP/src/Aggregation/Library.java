package Aggregation;

public class Library {

    String name ;
    int date;
    Books[] book;

    Library(String name , int date , Books[] book ){
        this.name = name ;
        this.date = date;
        this.book = book ;
    }
    void LibInfo(){
        System.out.println(name +" "+date);
        for (Books book : book ){
            book.displayInfo();
        }
    }
}
