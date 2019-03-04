package org.academiadecodigo.ThirdIslandTruck.Obstacles;

import org.academiadecodigo.ThirdIslandTruck.Util;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Cow extends GameObstacle {

    public Cow() {
        super(new Picture( 948, Util.getRandom(313, 645), "resources/cow2.png"));

    }
}
