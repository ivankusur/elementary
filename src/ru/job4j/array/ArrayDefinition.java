package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {

        short[] ages = new short[10];
        String[] sureName = new String[100500];
        float[] prices = new float[40];
        String[] names = new String[4];
        names[0] = "Ivan";
        names[1] = "Petr";
        names[2] = "Stas";
        names[3] = "Andrey";
        System.out.println(names[0] + " " + names[1] + " " + names[2] + " " + names[3]);
    }
}
