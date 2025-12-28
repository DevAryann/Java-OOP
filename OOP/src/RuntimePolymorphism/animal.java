package RuntimePolymorphism;

class animal {
    void sound() {
        System.out.println("sound");
    }
}
class Dog extends animal {
    void sound(){
        System.out.println("Barks");

    }
}
class cat extends animal {
    void sound(){
        System.out.println("meow");

    }
}
