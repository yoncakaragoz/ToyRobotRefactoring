package com.trendyol.toyrobot.domain.direction;

import com.trendyol.toyrobot.domain.point.Point;

public interface Direction {

    public void turnLeft() ;
    public void turnRight() ;
    public void move(Point point);
}
