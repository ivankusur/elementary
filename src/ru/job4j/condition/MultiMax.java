package ru.job4j.condition;

public class MultiMax {
    public static int max(int first, int second, int third) {
       boolean compareFirstSecond = first > second;
       int moreNumber = compareFirstSecond ? first : second;
       boolean compareMoreNumberThird = moreNumber > third;
       return compareMoreNumberThird ? moreNumber : third;
    }

    public static void main(String[] args) {
        System.out.println(MultiMax.max(1, 4, 2));
    }
}
