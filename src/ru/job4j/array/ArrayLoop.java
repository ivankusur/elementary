package ru.job4j.array;

public class ArrayLoop {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        for (int i = 1; i < numbers.length; i++) {
            numbers[i] = i * 2 + 3;
            System.out.print(numbers[i] + " ");
        }
    }
}
