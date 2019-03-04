package org.academiadecodigo.ThirdIslandTruck.Obstacles;

import org.academiadecodigo.ThirdIslandTruck.Util;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Beer extends GameObstacle {

    public Beer() {
        super(new Picture(948, Util.getRandom(313, 640), "resources/beer.png"));

    }
}
