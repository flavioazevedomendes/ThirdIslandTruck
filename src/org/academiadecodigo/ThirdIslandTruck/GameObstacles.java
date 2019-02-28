package org.academiadecodigo.ThirdIslandTruck;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public abstract class GameObstacles implements Colidable {
    private Picture picture;
    private Game game;

    public GameObstacles(Picture picture) {
        this.picture = picture;

    }

    public void move() {
        try {
            picture.translate(-3, 0);
            Thread.sleep(5);
        } catch (Exception ex) {

        }


    }

    @Override
    public boolean colide(Truck truck) {
        return false;
    }

    public void showObstacle() {
        picture.draw();
    }

    public void checkPosition(){
        if (picture.getX() <= 10){
            picture.delete();

        }
    }


    public int getPos() {
        return picture.getX();
    }
}
