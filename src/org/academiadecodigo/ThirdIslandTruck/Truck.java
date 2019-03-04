package org.academiadecodigo.ThirdIslandTruck;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Truck {
    private Picture truck;
    private Direction direction;


    public Truck() {
        truck = new Picture(20, 520, "resources/OldTruckRudybilhas.png");


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
            truck.translate(0, -12);
            return;
        }
        if (direction == Direction.DOWN){
         truck.translate(0, 12);

        }
        return;
    }

    public int getMaxX(){
        return truck.getMaxX();
    }

    public int getMaxY(){
        return truck.getMaxY();
    }

    public int getY(){
        return truck.getY();
    }



    public void setDirection(Direction direction) {
        this.direction = direction;
        move();
    }

    public void showTruck(){
        truck.draw();

    }
}

