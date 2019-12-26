package com.nickdnepr.core.models;

import com.nickdnepr.core.map.Point;
import com.nickdnepr.core.models.base.GameObject;

import java.util.ArrayList;
import java.util.Random;

public class Unit extends GameObject {

    private int health;
    private int maxHealth;
    private double actionPoints;
    private double maxActionPoints;
    private int defence = 0;
    private int maxDefence = 0;
    private int attack = 0;
    private int maxAttack = 0;
    private int armor = 0;
    private int maxArmor = 0;
    private ArrayList<Weapon> weapons = new ArrayList<>();
    private ArrayList<Equipment> equipment = new ArrayList<>();
    private Point position;

    public static final String type = "unit";

    // constructors

    public Unit(
            int health,
            int maxHealth,
            double actionPoints,
            double maxActionPoints,
            int defence,
            int maxDefence,
            int attack,
            int maxAttack,
            int armor,
            int maxArmor,
            ArrayList<Weapon> weapons,
            ArrayList<Equipment> equipment,
            Point position
    ) {
        super(type);
        this.health = health;
        this.maxHealth = maxHealth;
        this.actionPoints = actionPoints;
        this.maxActionPoints = maxActionPoints;
        this.defence = defence;
        this.maxDefence = maxDefence;
        this.attack = attack;
        this.maxAttack = maxAttack;
        this.armor = armor;
        this.maxArmor = maxArmor;
        this.weapons = weapons;
        this.equipment = equipment;
        this.position = position;
    }

    public Unit(
            int health,
            int maxHealth,
            double actionPoints,
            double maxActionPoints,
            int defence,
            int attack,
            ArrayList<Weapon> weapons,
            ArrayList<Equipment> equipment,
            Point position
    ) {
        super(type);
        this.health = health;
        this.maxHealth = maxHealth;
        this.actionPoints = actionPoints;
        this.maxActionPoints = maxActionPoints;
        this.defence = defence;
        this.maxDefence = defence;
        this.attack = attack;
        this.maxAttack = attack;
        this.weapons = weapons;
        this.equipment = equipment;
        this.position = position;
    }

    public Unit(
            int health,
            int maxHealth,
            double actionPoints,
            double maxActionPoints,
            int defence,
            int attack,
            Point position
    ) {
        super(type);
        this.health = health;
        this.maxHealth = maxHealth;
        this.actionPoints = actionPoints;
        this.maxActionPoints = maxActionPoints;
        this.defence = defence;
        this.maxDefence = defence;
        this.attack = attack;
        this.maxAttack = attack;
        this.position = position;
    }

    public Unit(
            int health,
            int maxHealth,
            double actionPoints,
            double maxActionPoints,
            Point position
    ) {
        super(type);
        this.health = health;
        this.maxHealth = maxHealth;
        this.actionPoints = actionPoints;
        this.maxActionPoints = maxActionPoints;
        this.position = position;
    }

    public Unit(
            int health,
            double actionPoints,
            Point position
    ) {
        super(type);
        this.health = health;
        this.maxHealth = health;
        this.actionPoints = actionPoints;
        this.maxActionPoints = actionPoints;
        this.position = position;
    }

    public Unit(
            int health,
            double actionPoints
    ) {
        super(type);
        this.health = health;
        this.maxHealth = health;
        this.actionPoints = actionPoints;
        this.maxActionPoints = actionPoints;
        this.position = null;
    }

    // behaviour

    public void defend() {
        defence += actionPoints;
        actionPoints = 0;
    }

    public void attack(Unit unit, Weapon weapon) {
        if (!weapons.contains(weapon)) {
            throw new IllegalArgumentException("Unit with id " + getId() + " does not have weapon with id " + weapon.getId());
        }
        int damageOptions = weapon.getMaxDamage() - weapon.getMinDamage() + 1;
        int[] damages = new int[damageOptions];
        for (int i = 0; i < damages.length; i++) {
            damages[i] = weapon.getMinDamage() + i;
        }
        Random random = new Random();
        double rawDamage = damages[random.nextInt(damageOptions)];
        double coefficient = 1.0 + 0.025 * (finalAttack() + weapon.getAttackBonus() - unit.finalDefence());
        rawDamage *= coefficient;
        rawDamage -= rawDamage % 1;
        int finalRawDamage = (int) rawDamage;
        System.out.println(finalRawDamage);
        if (unit.finalArmor() > weapon.getArmorPiercing()) {
            finalRawDamage *= 0.2;
        }
        System.out.println(finalRawDamage);
        unit.setHealth(unit.getHealth() - finalRawDamage);
    }

    public int finalAttack() {
        int finalAttack = 0;
        for (Equipment equipment : equipment) {
            finalAttack += equipment.getAttackBonus();
        }
        finalAttack += attack;
        return finalAttack;
    }

    public int finalDefence() {
        int finalDefence = 0;
        for (Equipment equipment : equipment) {
            finalDefence += equipment.getDefenceBonus();
        }
        finalDefence += defence;
        return finalDefence;
    }

    public int finalArmor() {
        int finalArmor = 0;
        for (Equipment equipment : equipment) {
            finalArmor += equipment.getArmorBonus();
        }
        finalArmor += armor;
        return finalArmor;
    }

    // getters and setters

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }

    public double getActionPoints() {
        return actionPoints;
    }

    public void setActionPoints(double actionPoints) {
        this.actionPoints = actionPoints;
    }

    public double getMaxActionPoints() {
        return maxActionPoints;
    }

    public void setMaxActionPoints(double maxActionPoints) {
        this.maxActionPoints = maxActionPoints;
    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    public int getMaxDefence() {
        return maxDefence;
    }

    public void setMaxDefence(int maxDefence) {
        this.maxDefence = maxDefence;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getMaxAttack() {
        return maxAttack;
    }

    public void setMaxAttack(int maxAttack) {
        this.maxAttack = maxAttack;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public int getMaxArmor() {
        return maxArmor;
    }

    public void setMaxArmor(int maxArmor) {
        this.maxArmor = maxArmor;
    }

    public ArrayList<Weapon> getWeapons() {
        return weapons;
    }

    public void setWeapons(ArrayList<Weapon> weapons) {
        this.weapons = weapons;
    }

    public ArrayList<Equipment> getEquipment() {
        return equipment;
    }

    public void setEquipment(ArrayList<Equipment> equipment) {
        this.equipment = equipment;
    }

    public Point getPosition() {
        return position;
    }

    public void setPosition(Point position) {
        this.position = position;
    }
}
