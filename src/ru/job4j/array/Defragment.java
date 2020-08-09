package ru.job4j.array;

public class Defragment {
    public static String[] swap(String[] array, int source, int dest) {
        String temp = array[source];
        array[source] = array[dest];
        array[dest] = temp;
        return array;
    }

    public static String[] compress(String[] array) {
        int indexNull = 0;
        int indexNotNull = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                indexNull = i;
                for (int j = 0; j < array.length; j++) {
                    if (array[j] != null) {
                        indexNotNull = j;
                    }
                }
                if (indexNotNull > indexNull) {
                    array = swap(array, indexNull, indexNotNull);
                }
                System.out.print(array[i] + " ");
            }
        }
        return array;
    }

    public static void main(String[] args) {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = compress(input);
        System.out.println();
        for (int index = 0; index < compressed.length; index++) {
            System.out.print(compressed[index] + " ");
        }
    }
}
