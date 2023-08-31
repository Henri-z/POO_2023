package app;

import pacote1.Dog;
import pacote2.Cat;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Dog d1 = new Dog();
        Cat c1 = new Cat();
        d1.late();
        c1.mia();
    }
}
