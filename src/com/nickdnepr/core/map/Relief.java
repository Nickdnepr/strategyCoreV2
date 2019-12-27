package com.nickdnepr.core.map;

public enum Relief {

    EARTH("E"),
    SAND("S"),
    SWAMP("B"),
    HILL("H"),
    MOUNTAIN("M"),
    WATER("W");

    private String symbol;

    Relief(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }
}
