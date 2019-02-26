package org.academiadecodigo.ThirdIslandTruck;


public class Game {

    public static final int ROAD_MIN_Y = 10;
    public static final int ROAD_HEIGHT = 400;
    public static final int LINE1 = 400;
    public static final int LINE2 = 800;

    private GameObstacles[] gameObstacles;
    private Truck truck;
    private Road road;

    public Game() {
        road = new Road();
        truck = new Truck();
        gameObstacles = new GameObstacles[3];

    }

    public void start() {
        init();
        while (true) {
            for (int i = 0; i < gameObstacles.length - 1; i++) {
                gameObstacles[i].showObstacle();
                gameObstacles[i].move();
                gameObstacles[i].checkPos();

            }
        }

    }

    public void init() {
        for (int i = 0; i < gameObstacles.length; i++) {
            gameObstacles[i] = ObstaclesFactory.createObstacles();

        }
    }
}
