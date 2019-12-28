package com.nickdnepr.core.map.routing;

import java.util.Objects;

public class Rib {

    private String qualifier;
    private GraphPoint source;
    private GraphPoint destination;
    private double price;

    public Rib(GraphPoint source, GraphPoint destination, double price) {
        this.qualifier = source.getQualifier() + "->" + destination.getQualifier();
        this.source = source;
        this.destination = destination;
        this.price = price;
    }

    public GraphPoint getSource() {
        return source;
    }

    public void setSource(GraphPoint source) {
        this.source = source;
    }

    public GraphPoint getDestination() {
        return destination;
    }

    public void setDestination(GraphPoint destination) {
        this.destination = destination;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getQualifier() {
        return qualifier;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rib rib = (Rib) o;
        return Objects.equals(qualifier, rib.qualifier);
    }

    @Override
    public int hashCode() {
        return Objects.hash(qualifier);
    }
}
