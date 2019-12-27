package com.nickdnepr.core.map;

import com.nickdnepr.core.map.routing.Graph;

import java.util.Arrays;

public class ReliefMap {

    private int width;
    private int height;

    private Point[][] body;

    public ReliefMap(int width, int height) {
        this.width = width;
        this.height = height;
        body = new Point[height][width];
    }

    @Deprecated
    public void setPoint(int x, int y, Point point) {
        body[y][x] = point;
    }

    public void setPoint(Point point){
        body[point.getY()][point.getX()] = point;
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

    public String simpleVisualize() {
        StringBuilder str = new StringBuilder();
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                Point point = getPoint(x, y);
                str.append(point != null ? point.getRelief().getSymbol() : "*");
                str.append("  ");
            }
            str.append('\n');
        }
        return str.toString();
    }

    public Graph toGraph(){
        return null;
    }

}
