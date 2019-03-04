package org.academiadecodigo.ThirdIslandTruck.Obstacles;

import org.academiadecodigo.ThirdIslandTruck.Sound;
import org.academiadecodigo.ThirdIslandTruck.Truck;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public abstract class GameObstacle implements Colidable {
    private Picture picture;
    private boolean showed;


    public GameObstacle(Picture picture) {
        this.picture = picture;
        showed = false;

    }

    public void move() {
        if (showed) {
            picture.translate(-4, 0);
            return;
        }
        return;
    }

    public void moveTo(int x, int y) {
        picture.translate(x - picture.getX(), y - picture.getY());
    }

    @Override
    public boolean checkCollisions(Truck truck) {
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
        showed = true;
        if (this instanceof Cow) {
            Sound cow = new Sound("/resources/Sound/cow.wav");
            cow.play(true);
            picture.draw();
            return;
        }
        if (this instanceof OldLady) {
            Sound oldLady = new Sound("/resources/Sound/escomungado.wav");
            oldLady.play(true);
            picture.draw();
            return;
        }
        picture.draw();
    }

    public void hideObstacle() {
        showed = false;
        picture.delete();
        moveTo(948, Util.getRandom(313, 650));
    }

    public boolean checkPosition() {
        if (picture.getX() <= 10) {
            hideObstacle();

            return true;
        }

        return false;
    }


}
