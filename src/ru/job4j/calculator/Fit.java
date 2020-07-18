package ru.job4j.calculator;

public class Fit {
    public static double manWeight(short height) {
        return (height - 100) * 1.15;
    }

    public static double womanWeight(short height) {
        return (height - 110) * 1.15;
    }

    public static void main(String[] args) {
        short manheight = 177;
        double man = Fit.manWeight(manheight);
        System.out.println("Man 177 is " + man);

        short womanWeight = 167;
        double wonam = Fit.womanWeight(womanWeight);
        System.out.println("Woman 167 is " + wonam);

    }
}
