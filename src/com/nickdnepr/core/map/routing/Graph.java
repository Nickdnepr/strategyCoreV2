package com.nickdnepr.core.map.routing;

import java.util.HashMap;

public class Graph {

    private HashMap<String, GraphPoint> points;
    private HashMap<String, Rib> ribs;

    public Graph() {
        this.points = new HashMap<>();
        this.ribs = new HashMap<>();
    }

    public HashMap<String, GraphPoint> getPoints() {
        return points;
    }

    public HashMap<String, Rib> getRibs() {
        return ribs;
    }

    public boolean addPoint(GraphPoint point) {
        return points.putIfAbsent(point.getQualifier(), point) == null;
    }

    public boolean addRib(GraphPoint source, GraphPoint destination, double price) {
        if (!points.containsValue(source) || !points.containsValue(destination)) {
            return false;
        }

        Rib rib = new Rib(source, destination, price);

        if (source.getOutRibs().contains(rib) || destination.getInRibs().contains(rib)) {
            return false;
        }

        if (ribs.containsValue(rib)){
            return false;
        }



        return true;
    }

}
