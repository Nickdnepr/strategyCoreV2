package com.nickdnepr.core.map.routing;

import com.nickdnepr.core.map.Point;

import java.util.ArrayList;

public class Graph {

    private ArrayList<Point> points;
    private ArrayList<Rib> ribs;

    public Graph(ArrayList<Point> points, ArrayList<Rib> ribs) {
        this.points = points;
        this.ribs = ribs;
    }

    public ArrayList<Point> getPoints() {
        return points;
    }

    public ArrayList<Rib> getRibs() {
        return ribs;
    }
}
