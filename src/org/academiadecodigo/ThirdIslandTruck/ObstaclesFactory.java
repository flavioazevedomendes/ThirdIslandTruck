package org.academiadecodigo.ThirdIslandTruck;

public class ObstaclesFactory {

    public static GameObstacles createObstacles() {
       // GameObstacles[] gameObstacles = new GameObstacles[quantity];
       // for (int i = 0; i <= gameObstacles.length; i++) {

            double random = (Math.random());

            if (random <= .5) {
                return new OldLady();

            }
        return new Cow();
    }
}

