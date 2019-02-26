package org.academiadecodigo.ThirdIslandTruck;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public abstract class GameObstacles implements Colidable {
    private Picture picture;

    public GameObstacles(Picture picture) {

        this.picture = picture;
    }

    public void move() {
      //  while (picture.getX() >= 10) {
            try {
            picture.translate(-8, 0);
                Thread.sleep(200);
            } catch (Exception ex) {

            }
            if(picture.getX() <= 10){
                picture.delete();
            }
       // }
        //picture.delete();

    }

    @Override
    public boolean colide(Truck truck) {
        return false;
    }

    public void showObstacle() {
        picture.draw();
    }

    public void checkPos() {
        if (picture.getX() == 800) {
            GameObstacles gameObstacles = ObstaclesFactory.createObstacles();
            gameObstacles.showObstacle();
            System.out.println("aaaaa");
        }
    }

}
