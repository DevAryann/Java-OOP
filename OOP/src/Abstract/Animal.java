package Abstract;


abstract class Animal {
    abstract void sound();
}
class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("woff");

    }
}
class cat extends Animal {
    @Override
    void sound(){
        System.out.println("meow");


    }
}