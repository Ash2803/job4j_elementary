package ru.job4j.calculcator;

public class Point {

    public static double distance(int x1, int y1, int x2, int y2) {
        double rsl = ((x2 - x1) * 2) + ((y2 - y1) * 2);
        return Math.sqrt(rsl);
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        double result1 = Point.distance(2, 0, 4, 0);
        double result2 = Point.distance(2, 2, 6, 2);
        double result3 = Point.distance(6, 2, 6, 4);

        System.out.println("result (0, 0) to (2, 0) " + result);
        System.out.println("result (2, 0) to (4, 0) " + result1);
        System.out.println("result (2, 2) to (6, 2) " + result2);
        System.out.println("result (48, 42) to (22, 12) " + result3);
    }
}
