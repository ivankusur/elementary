package ru.job4j.condition;

import static java.lang.Math.*;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        return  Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
    }

    public static void main(String[] args) {
        double result = Point.distance(50, 34, 55, 37);
        System.out.println("result (50, 34) to (55, 37) " + result);
    }
}
