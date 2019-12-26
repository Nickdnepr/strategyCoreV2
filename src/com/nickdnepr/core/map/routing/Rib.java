package com.nickdnepr.core.map.routing;

import com.nickdnepr.core.map.Point;

public class Rib {

    private Point source;
    private Point destination;
    private double price;

    public Rib(Point source, Point destination, double price) {
        this.source = source;
        this.destination = destination;
        this.price = price;
    }

    public Point getSource() {
        return source;
    }

    public void setSource(Point source) {
        this.source = source;
    }

    public Point getDestination() {
        return destination;
    }

    public void setDestination(Point destination) {
        this.destination = destination;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
