package Static;

public class Car {
    private String model;
    private String colour;
    private int speed;
    static int NumberOfCars ;
    public Car(String model , String color , int speed ){

        this.colour = color;
        this.model = model;
        this.speed = speed;
        NumberOfCars++;


    }

    void drive(){
        System.out.println("the car is "+ model +" colour is "+ colour + " and running at the speed of " + speed + "KmH");
    }
    static void showNum(){
        System.out.println("the number of cars is: "+ NumberOfCars);
    }


}
