package org.academiadecodigo.ThirdIslandTruck;

import java.util.LinkedList;

public class Game {

    public static final int ROAD_MIN_Y = 285;
    public static final int ROAD_HEIGHT = 703;
    public static final int LINE1 = 400;
    public static final int LINE2 = 800;

    private LinkedList obstaclesList;
    private Truck truck;
    private Road road;

    public Game() {
        road = new Road();
        truck = new Truck();
        this.obstaclesList = new LinkedList();

    }

    public void start() {
        init();
        GameObstacles obstacle = generateObstacle();
        while (true) {
            obstacle.move();
            obstacle.checkPosition();

        }
    }


    public void init() {
        for (int i = 0; i < 10; i++) {
            obstaclesList.add(ObstaclesFactory.createObstacles());

        }
    }

    public GameObstacles generateObstacle() {
        GameObstacles obstacle = (GameObstacles) obstaclesList.getFirst();
        obstaclesList.removeFirst();
        obstacle.showObstacle();
        return obstacle;

    }

    public GameObstacles getNew(GameObstacles obstacles) {
        if (obstacles.getPos() <= 803 && obstacles.getPos() >= 798) {
            return generateObstacle();

        }
        return obstacles;
    }
}

