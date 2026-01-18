package Aggregation;

public class Books {
    String name;
    int date ;

    Books(String name , int date){
        this.name = name;
        this.date = date ;


    }
    void displayInfo(){

        System.out.println(this.name + " " + this.date);

    }
}
