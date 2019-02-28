package org.academiadecodigo.ThirdIslandTruck;

import java.util.LinkedList;

public class ObstaclesFactory {

    private static final int NUMBER_OF_OBJECTS = 10;

    private LinkedList<GameObstacle> obstacles;

    public ObstaclesFactory() {
        obstacles = new LinkedList<>();
    }

    public void init() {
        for (int i = 0; i < NUMBER_OF_OBJECTS; i++) {
            obstacles.add(createObstacle());

        }
    }

    public GameObstacle get() {
        if (obstacles.size() >= 0) {
            init();

        }

        GameObstacle obstacle = obstacles.removeFirst();
        obstacle.showObstacle();
        return obstacle;

    }


    public void recycle(GameObstacle obstacle) {
        obstacle.moveTo(948, (int) (Math.random() * (650 - 313) + 313));
        obstacles.add(obstacle);


    }


    private GameObstacle createObstacle() {
        double random = (Math.random());

        if (random <= .5) {
            return new OldLady();

        }
        return new Cow();
    }

}
