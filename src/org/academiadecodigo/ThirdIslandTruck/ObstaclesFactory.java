package org.academiadecodigo.ThirdIslandTruck;

public class ObstaclesFactory {

    public static GameObstacles[] createObstacles(int quantity) {
        GameObstacles[] gameObstacles = new GameObstacles[quantity];
        for (int i = 0; i <= gameObstacles.length; i++) {

            double random = (Math.random());

            if (random <= .3) {
                //gameObstacles[i] = new Beer();
                continue;

            }
            if (random <= .6) {
                //gameObstacles[i] = new Hole();
                continue;

            }
           // gameObstacles[i] = new Cow();
        }
        return gameObstacles;
    }
}
