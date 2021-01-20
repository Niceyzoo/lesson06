package ru.geekbrains.lesson06;

public class Animal {
    private String name;
    private Integer maxRun;
    private Integer maxSwim;
    private static int numb;


    public Animal(String name, Integer maxRun, Integer maxSwim) {
        this.name = name;
        this.maxRun = maxRun;
        this.maxSwim = maxSwim;
        numb++;
    }

    public Animal() {

    }

    public String getName() {
        return name;
    }
    public Integer getMaxRun() {
        return maxRun;
    }
    public Integer getMaxSwim() {
        return maxSwim;
    }




    void run () {
        System.out.println("Животное " +getName() + " пробежало "+getMaxRun() +" m");
    }
    void swim () {
        System.out.println("Животное " +getName() + " проплыло "+getMaxSwim() +" m");
    }

    public static int counter() {
        return numb;
    }


    public void numb() {
        System.out.println("Всего бегало животных = " + numb);
    }
}
