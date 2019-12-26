package com.nickdnepr.core.models;

import com.nickdnepr.core.models.base.GameObject;

public class Equipment extends GameObject {

    private double actionPointsBonus;
    private int defenceBonus;
    private int attackBonus;
    private int armorBonus;

    public static final String type = "equipment";

    public Equipment(double actionPointsBonus, int defenceBonus, int attackBonus, int armorBonus) {
        super(type);
        this.actionPointsBonus = actionPointsBonus;
        this.defenceBonus = defenceBonus;
        this.attackBonus = attackBonus;
        this.armorBonus = armorBonus;
    }

    public Equipment(String type, double actionPointsBonus) {
        super(type);
        this.actionPointsBonus = actionPointsBonus;
    }

    public double getActionPointsBonus() {
        return actionPointsBonus;
    }

    public int getDefenceBonus() {
        return defenceBonus;
    }

    public int getAttackBonus() {
        return attackBonus;
    }

    public int getArmorBonus() {
        return armorBonus;
    }

    public static Equipment armorJacket(int defenceClass, int armorBonus) {
        return new Equipment(0, defenceClass, 0, armorBonus);
    }
}
