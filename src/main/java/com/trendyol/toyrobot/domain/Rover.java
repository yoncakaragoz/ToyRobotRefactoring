package com.trendyol.toyrobot.domain;

import com.trendyol.toyrobot.domain.point.Point;

public class Rover {

    Point point;
    private Compass compass;

    public Rover() {
        point = new Point(0,0);
        this.compass = Compass.NORTH;
    }

    public Rover(int x, int y, Compass compass) {
        point = new Point(x,y);
        this.compass = compass;
    }

    public void move() {
        this.point.
    }

    public void turnLeft() {
        if (Compass.NORTH.equals(this.compass)) {
            this.compass = Compass.WEST;
        } else if (Compass.WEST.equals(this.compass)) {
            this.compass = Compass.SOUTH;
        } else if (Compass.SOUTH.equals(this.compass)) {
            this.compass = Compass.EAST;
        } else if (Compass.EAST.equals(this.compass)) {
            this.compass = Compass.NORTH;
        }
    }

    public void turnRight() {
        if (Compass.NORTH.equals(this.compass)) {
            this.compass = Compass.EAST;
        } else if (Compass.EAST.equals(this.compass)) {
            this.compass = Compass.SOUTH;
        } else if (Compass.SOUTH.equals(this.compass)) {
            this.compass = Compass.WEST;
        } else if (Compass.WEST.equals(this.compass)) {
            this.compass = Compass.NORTH;
        }
    }


}
