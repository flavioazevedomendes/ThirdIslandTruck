package org.academiadecodigo.ThirdIslandTruck;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public abstract class GameObstacle implements Colidable {
    private Picture picture;
    private Game game;

    public GameObstacle(Picture picture) {
        this.picture = picture;

    }

    public void move() {
            picture.translate(-3, 0);
    }

    public void moveTo(int x, int y) {
        picture.translate(x - picture.getX(), y - picture.getY());
    }

    @Override
    public boolean colide(Truck truck) {
        return false;
    }

    public void showObstacle() {
        picture.draw();
    }

    public boolean checkPosition(){
        if (picture.getX() <= 10){

            picture.delete();

            return true;
        }

        return false;
    }


}
