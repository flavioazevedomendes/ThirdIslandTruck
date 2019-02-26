package org.academiadecodigo.ThirdIslandTruck;

import org.academiadecodigo.simplegraphics.graphics.Movable;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Truck {
    private boolean drunk;
    private boolean crashed;
    private int drinkedBeers;
    private Picture truck;
    private Direction direction;


    public Truck() {
        this.drunk = false;
        this.crashed = false;
        this.drinkedBeers = 0;
        truck = new Picture(20, 520, "resources/OldTruck.png");
        truck.draw();
        KeyboardListener listener = new KeyboardListener(this);

    }

    public void crash() {
        this.crashed = true;

    }

    public boolean isCrashed() {
        return crashed;

    }

    public void move() {
       if (truck.getY() < Game.ROAD_MIN_Y && direction == Direction.UP) {
            truck.translate(0, 0);
            return;

        }

        if (truck.getMaxY() >= Game.ROAD_HEIGHT && direction == Direction.DOWN) {
            truck.translate(0, 0);
            return;

        }
        if (direction == Direction.UP) {
            truck.translate(0, -8);
            return;
        }
        truck.translate(0, 8);
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
        move();
    }
}
