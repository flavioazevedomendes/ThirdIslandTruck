package org.academiadecodigo.ThirdIslandTruck.Obstacles;

import org.academiadecodigo.ThirdIslandTruck.Util;


public class ObstaclesFactory {

    public GameObstacle createObstacle() {
        double random = Util.getRandom();

        if (random <= .25) {
            return new OldLady();

        }
        if (random <= .60) {
            return new Cow();

        }
        if (random <= .85) {

            return new Beer();
        }
        return new Hole();
    }
}
