class Animal{
    void sound(){
        System.out.println("Animal makes the Sound");
    }
}

class Dog extends Animal{
    // Overriding the sound() method
    @Override
    void sound(){
        System.out.println("Dog barks");
    }
}

class Cat extends Animal{
    // Overriding the sound() method
    @Override
    void sound(){
        System.out.println("Cat meows");
    }
}

public class Prac01_MethodOverriding {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.sound();
        Dog dog = new Dog();
        dog.sound();
        Cat cat = new Cat();
        cat.sound();

        // Using Polymorphism
        Animal polyDog = new Dog();
        polyDog.sound();

        Animal polyCat = new Cat(); 
        polyCat.sound();
    }
}
