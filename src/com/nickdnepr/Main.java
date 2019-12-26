package com.nickdnepr;

import com.nickdnepr.core.models.Equipment;
import com.nickdnepr.core.models.Unit;
import com.nickdnepr.core.models.Weapon;

public class Main {

    public static void main(String[] args) {
        Unit unit = new Unit(100, 10);
        Weapon rife = Weapon.testRife();
        unit.getWeapons().add(rife);
        Unit enemy = new Unit(100, 10);
        Equipment armorBelt = Equipment.armorJacket(1, 2);
        enemy.getEquipment().add(armorBelt);
        unit.attack(enemy, rife);

        System.out.println(enemy.getHealth());
    }
}
