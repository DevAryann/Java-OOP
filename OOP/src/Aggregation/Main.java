package Aggregation;

public class Main {
    public static void main(String[] args) {


        Books book1 = new Books("the fallen of the king", 1992);
        Books book2 = new Books("the fallen of the Land", 2002);


        Books[] books = {book1, book2};            //Aggregation in Java is a relationship between two classes
                                                   // that represents a "has-a" or "whole-part" association.
                                                   // It is a form of association where one class (the whole) contains a reference to another class (the part),
                                                   // but the part can exist independently of the whole.

        Library L1 = new Library("NYK", 2004 , books);

        L1.LibInfo();

    }
}
