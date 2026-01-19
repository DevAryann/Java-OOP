package Composition;

public class Car {
    String name;
    int date ;
    Engine engine;


    Car(String name , int date , String engineType ){

        this.name = name ;
        this.date = date;
        this.engine = new Engine(engineType);


    }

    void DisplayInfo(){
        System.out.println("The Info of car : "+this.name+ " " + this .date+ " " + this.engine.engineName);
    }
}
