package ru.geekbrains.lesson06;

public class Dog extends Animal {
    public Dog(String name, Integer maxRun, Integer maxSwim) {
        super(name, maxRun, maxSwim);
    }

    public Dog() {

    }

    @Override
    void swim () {
        if (getMaxRun()>10)
            System.out.println("Пёс " +getName() +" проплыл больше 10 м и устал!");
        else
            System.out.println("Пёс " +getName() +" проплыл " +getMaxSwim() +" m");
    }

    @Override
    void run () {
        if (getMaxRun()>500)
            System.out.println("Пёс " +getName() +" пробежал больше 500 м и устал!");
        else
            System.out.println("Пёс " +getName() +" пробежал " +getMaxRun() +" m");
    }
}
