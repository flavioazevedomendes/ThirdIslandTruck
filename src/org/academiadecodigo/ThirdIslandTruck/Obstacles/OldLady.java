package org.academiadecodigo.ThirdIslandTruck.Obstacles;

import org.academiadecodigo.ThirdIslandTruck.Util;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class OldLady extends GameObstacle {

    public OldLady() {
        super(new Picture(968, Util.getRandom(313,645), "resources/grandma.png"));

    }

}