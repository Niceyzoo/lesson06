package ru.geekbrains.lesson06;

public class Main06 {

    public static void main(String[] args) {

        Animal animal = new Animal("mishka", 15, 200);
        Cat cat = new Cat("tolik", 10, 115);
        Cat cat1 = new Cat("vladik", 201, 0);
        Dog dog = new Dog("vasya", 499, 15);
        animal.swim();
        animal.run();
        cat.swim();
        cat.run();
        dog.swim();
        dog.run();
        cat1.swim();
        cat1.run();
        animal.numb();


    }
}
