package com.nickdnepr.core.models.base;

import com.nickdnepr.utils.IdGen;

public class GameObject {

    private int id;
    private String type;

    public GameObject(String type) {
        this.id = IdGen.getId();
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }
}
