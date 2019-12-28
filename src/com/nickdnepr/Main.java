package com.nickdnepr;

import com.nickdnepr.core.map.Point;
import com.nickdnepr.core.map.Relief;
import com.nickdnepr.core.map.ReliefMap;
import com.nickdnepr.core.map.routing.Graph;
import com.nickdnepr.core.map.routing.GraphPoint;
import com.nickdnepr.core.map.routing.Rib;
import com.nickdnepr.core.models.Equipment;
import com.nickdnepr.core.models.Unit;
import com.nickdnepr.core.models.Weapon;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        HashMap<String, GraphPoint> map = new HashMap<>();
        GraphPoint point = new GraphPoint(new Point(0,0,Relief.EARTH));
        GraphPoint point2 = new GraphPoint(new Point(0,0,Relief.EARTH));

        map.put("a", point);

        Rib rib1 = new Rib(point, point2,2);
        Rib rib2 = new Rib(point, point2,2);

        ArrayList<Rib> ribs = new ArrayList<>();
        ribs.add(rib1);
        System.out.println(ribs.contains(rib2));

//        System.out.println(map.containsValue(point2));

//        testUnits();
//        testMap();
        testGraph();
    }

    public static void testUnits() {
        Unit unit = new Unit(100, 10);
        Weapon rife = Weapon.testRife();
        unit.getWeapons().add(rife);
        Unit enemy = new Unit(100, 10);
        Equipment armorBelt = Equipment.armorJacket(1, 2);
        enemy.getEquipment().add(armorBelt);
        unit.attack(enemy, rife);

        System.out.println(enemy.getHealth());
    }

    public static void testMap() {
        ReliefMap reliefMap = new ReliefMap(3, 3);

        reliefMap.setPoint(new Point(0, 0, Relief.EARTH));
        reliefMap.setPoint(new Point(1, 0, Relief.EARTH));
        reliefMap.setPoint(new Point(2, 0, Relief.EARTH));

        reliefMap.setPoint(new Point(0, 0, Relief.EARTH));
        reliefMap.setPoint(new Point(0, 1, Relief.EARTH));
        reliefMap.setPoint(new Point(0, 2, Relief.EARTH));

        reliefMap.setPoint(new Point(1, 1, Relief.WATER));
        reliefMap.setPoint(new Point(1, 2, Relief.WATER));
        reliefMap.setPoint(new Point(2, 1, Relief.WATER));

        reliefMap.setPoint(new Point(2, 2, Relief.SWAMP));

        reliefMap.toGraph();

        System.out.println(reliefMap.simpleVisualize());
    }

    public static void testGraph() {
        Graph graph = new Graph();
        Point point = new Point(0, 0, Relief.EARTH);
        Point point2 = new Point(0, 0, Relief.EARTH);

    }
}
