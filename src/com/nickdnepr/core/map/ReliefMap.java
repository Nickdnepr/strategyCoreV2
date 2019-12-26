package com.nickdnepr.core.map;

public class ReliefMap {

    private int width;
    private int height;

    private Point[][] body;

    public ReliefMap(int width, int height) {
        this.width = width;
        this.height = height;
        body = new Point[height][width];
    }

    public void setPoint(int x, int y, Point point) {
        body[y][x] = point;
    }

    public Point getPoint(int x, int y) {
        return body[y][x];
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
