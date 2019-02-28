package org.academiadecodigo.ThirdIslandTruck;

import java.util.LinkedList;

public class Game {

    public static final int ROAD_MIN_Y = 285;
    public static final int ROAD_HEIGHT = 703;
    public static final int LINE1 = 400;
    public static final int LINE2 = 800;

    private ObstaclesFactory factory;
    private Truck truck;
    private Road road;
    private LinkedList<GameObstacle> activeList;

    public Game() {
        road = new Road();
        truck = new Truck();
        activeList = new LinkedList<>();

    }

    public void start() {

        GameObstacle obstacle = factory.get();
        activeList.add(obstacle);
        int counter = 0;
        while (true) {
            for (GameObstacle obstacle1 : activeList) {
                obstacle1.move();
                if (obstacle1.checkPosition()) {

                    continue;
                }
            }

                if (counter == 100) {
                    activeList.add(factory.get());
                    counter = 0;

                }

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();

            }

            counter++;
        }
    }

    private GameObstacle swapObstacle(GameObstacle obstacle) {
        factory.recycle(obstacle);
        return factory.get();
    }


    public void init() {
        factory = new ObstaclesFactory();
        factory.init();
    }

}

