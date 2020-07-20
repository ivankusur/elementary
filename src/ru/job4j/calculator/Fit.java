package ru.job4j.calculator;

public class Fit {
    public static double manWeight(double height) {
        return (height - 100) * 1.15;
    }

    public static double womanWeight(double height) {
        return (height - 110) * 1.15;
    }

    public static void main(String[] args) {
        double manheight = 177;
        double man = Fit.manWeight(manheight);
        System.out.println("Man 177 is " + man);

        double womanWeight = 167;
        double woman = Fit.womanWeight(womanWeight);
        System.out.println("Woman 167 is " + woman);

    }
}
