package RuntimePolymorphism;

public class Main {
    public static void main(String[] args){
            animal Animal1 = new Dog();
            animal Animal2 = new cat();

            Animal1.sound();
            Animal2.sound();

    }

}
