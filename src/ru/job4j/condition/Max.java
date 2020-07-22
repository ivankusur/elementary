package ru.job4j.condition;

public class Max {
    public static int max(int first, int second) {
        boolean compare = first > second;
        int result = compare ? first : second;
        return result;
    }

    public static void main(String[] ars) {
        System.out.println(max(10, 5));
    }
}
