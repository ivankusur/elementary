package ru.job4j.Calculator;

public class ArgMethod {
    public static void hello(String name) {
        System.out.println("Hello, " + name);
    }

    public static void main(String[] args) {
        String name = "Petr Arsentev";
        String age = "33";

        ArgMethod.hello(name);

        ArgMethod.hello(age);

        ArgMethod.hello(age);

        ArgMethod.hello(name);
    }
}
