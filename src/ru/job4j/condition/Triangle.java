package ru.job4j.condition;

public class Triangle {
    public static String exist(double ab, double ac, double bc) {
        boolean exist = ab + bc > ac & bc + ac > ab & ac + ab > bc;
        String triangleExist = exist ? "Triangle Exist" : "Triangle Absent";
        return triangleExist;
    }

    public static void main(String[] args) {
        String triangle = Triangle.exist(2.0, 2.0, 2.0);
        System.out.println(triangle);
    }
}
