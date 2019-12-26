package com.nickdnepr.core.map.routing;

import com.nickdnepr.core.map.Point;

public interface RoutingPredicate {

    boolean validatePoint(Point point);


}
