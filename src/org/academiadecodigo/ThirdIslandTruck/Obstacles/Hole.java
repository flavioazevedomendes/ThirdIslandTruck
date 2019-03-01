package org.academiadecodigo.ThirdIslandTruck.Obstacles;

import org.academiadecodigo.ThirdIslandTruck.Util;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Hole extends GameObstacle {

    public Hole() {
        super(new Picture(948, Util.getRandom(313, 650), "resources/Holeone.png"));

    }
}
