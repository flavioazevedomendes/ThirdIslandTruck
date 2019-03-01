package org.academiadecodigo.ThirdIslandTruck.Obstacles;

import org.academiadecodigo.ThirdIslandTruck.Truck;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public abstract class GameObstacle implements Colidable {
    private Picture picture;
    private int beerCount;

    public GameObstacle(Picture picture) {
        this.picture = picture;
        beerCount = 0;

    }

    public void move() {
        picture.translate(-3, 0);
    }

    public void moveTo(int x, int y) {
        picture.translate(x - picture.getX(), y - picture.getY());
    }

    @Override
    public boolean collide(Truck truck) {
        if (truck.getMaxX() >= picture.getX()) {
            if (truck.getMaxY() <= picture.getMaxY() && truck.getMaxY() >= picture.getY()) {
                return true;
                }
            if (truck.getY() <= picture.getMaxY() && truck.getY() >= picture.getY()) {
                return true;
            }
            if (picture.getY() >= truck.getY() &&
                    picture.getY() <= truck.getMaxY() &&
                    picture.getMaxY() <= truck.getMaxY() &&
                    picture.getMaxY() >= truck.getY()) {
                return true;
            }
            }
        return false;
        }


    public void showObstacle() {
        picture.draw();
    }

    public void hideObstacle() {
        picture.delete();
    }

    public boolean checkPosition() {
        if (picture.getX() <= 10) {

            picture.delete();

            return true;
        }

        return false;
    }


    public int getBeerCount() {
        return beerCount;
    }


}
