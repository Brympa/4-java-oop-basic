package com.example.task05;

public class Task05Main {
    public static void main(String[] args) {
        PolygonalLine line = new PolygonalLine();
        line.addPoint(0, 0);
        line.addPoint(1, 6);
        line.addPoint(2, 7);
        line.addPoint(8, 9);
        line.addPoint(11, 99);
        line.addPoint(15, 101);

        System.out.println(line.getLength());
    }
}
