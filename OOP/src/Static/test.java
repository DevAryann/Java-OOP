package Static;
public class test {
    public static void main ( String[] args){

        Car MyCar = new Car("Toyota", "Black" , 23);
        Car MyCar2 = new Car("Honda", "white" , 30);

        MyCar.drive();
        Car.showNum();
    }
}
