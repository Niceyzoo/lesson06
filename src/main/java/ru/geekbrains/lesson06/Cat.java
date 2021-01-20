package ru.geekbrains.lesson06;

public class Cat extends Animal {
    public Cat(String name, Integer maxRun, Integer maxSwim) {
        super(name, maxRun, maxSwim);
    }

    public Cat() {

    }

    @Override
    void swim () {
        System.out.println("Кот " +getName() +" не умеет плавать!");
    }

    @Override
    void run () {
        if (getMaxRun()>200)
            System.out.println("Кот " +getName() +" пробежал больше 200 м и устал!");
        else
            System.out.println("Кот " +getName() +" пробежал " +getMaxRun() +" m");
    }
}

