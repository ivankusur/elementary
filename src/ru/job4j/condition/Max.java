package ru.job4j.condition;

public class Max<result> {
    public static int max(int first, int second) {
        boolean compare = first > second;
        int result = compare ? first : second;
        if (first == second) {
            result = first;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(max(10, 5));
    }
}
