package org.academiadecodigo.ThirdIslandTruck;

public class ObstaclesFactory {

    public static GameObstacles createObstacles() {

            double random = (Math.random());

            if (random <= .5) {
                return new OldLady();

            }
        return new Cow();
    }
}

