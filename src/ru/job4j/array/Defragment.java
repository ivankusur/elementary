package ru.job4j.array;

public class Defragment {
    public static String[] swap(String[] array, int source, int dest) {
        String temp = array[source];
        array[source] = array[dest];
        array[dest] = temp;
        return array;
    }

    public static String[] compress(String[] array) {
        int indexNull;
        int indexNotNull = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                indexNull = i;
                for (int j = i + 1; j < array.length; j++) {
                    if (array[j] != null) {
                        indexNotNull = j;
                        break;
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
}
