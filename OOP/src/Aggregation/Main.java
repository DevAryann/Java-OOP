package Aggregation;

public class Main {
    public static void main(String[] args) {


        Books book1 = new Books("the fallen of the king", 1992);
        Books book2 = new Books("the fallen of the Land", 2002);


        Books[] books = {book1, book2};

//        for (Books book : books) {
//            book.displayInfo();
//
//        }
        Library L1 = new Library("NYK", 2004 , books);

        L1.LibInfo();

    }
}
