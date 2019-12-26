package com.nickdnepr.core.models;

import com.nickdnepr.core.models.base.GameObject;

public class Weapon extends GameObject {

    private int minDamage;
    private int maxDamage;
    private int attackBonus;
    private int armorPiercing;
    private double maxDistance;

    public static final String type = "weapon";

    public Weapon(int minDamage, int maxDamage, int attackBonus, int armorPiercing, double maxDistance) {
        super(type);
        this.minDamage = minDamage;
        this.maxDamage = maxDamage;
        this.attackBonus = attackBonus;
        this.armorPiercing = armorPiercing;
        this.maxDistance = maxDistance;
    }

    public int getMinDamage() {
        return minDamage;
    }

    public int getMaxDamage() {
        return maxDamage;
    }

    public int getAttackBonus() {
        return attackBonus;
    }

    public int getArmorPiercing() {
        return armorPiercing;
    }

    public double getMaxDistance() {
        return maxDistance;
    }

    public static Weapon testRife() {
        return new Weapon(4, 10, 1, 1, 3);
    }
}
