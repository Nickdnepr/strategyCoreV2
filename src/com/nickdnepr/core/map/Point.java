package com.nickdnepr.core.map;

public class Point {

    private int x;
    private int y;
    private Relief relief;

    public Point(int x, int y, Relief relief) {
        this.x = x;
        this.y = y;
        this.relief = relief;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Relief getRelief() {
        return relief;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                ", relief=" + relief +
                '}';
    }
}
