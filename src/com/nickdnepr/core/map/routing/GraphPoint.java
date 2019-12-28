package com.nickdnepr.core.map.routing;

import com.nickdnepr.core.map.Point;

import java.util.ArrayList;
import java.util.Objects;

public class GraphPoint {

    private String qualifier;
    private Point point;
    private ArrayList<Rib> outRibs;
    private ArrayList<Rib> inRibs;

    public GraphPoint(Point point) {
        this.qualifier = point.getX() + "_" + point.getY();
        this.point = point;
        this.outRibs = new ArrayList<>();
        this.inRibs = new ArrayList<>();
    }

    public String getQualifier() {
        return qualifier;
    }

    public Point getPoint() {
        return point;
    }

    public ArrayList<Rib> getOutRibs() {
        return outRibs;
    }

    public ArrayList<Rib> getInRibs() {
        return inRibs;
    }

    public boolean addOutRib(Rib rib) {
        if (outRibs.contains(rib)) {
            return false;
        }
        outRibs.add(rib);
        return true;
    }

    public boolean addInRib(Rib rib) {
        if (inRibs.contains(rib)) {
            return false;
        }
        inRibs.add(rib);
        return true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GraphPoint point = (GraphPoint) o;
        return Objects.equals(qualifier, point.qualifier);
    }

    @Override
    public int hashCode() {
        return Objects.hash(qualifier);
    }
}
