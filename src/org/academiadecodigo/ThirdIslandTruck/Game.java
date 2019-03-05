package org.academiadecodigo.ThirdIslandTruck;

import org.academiadecodigo.ThirdIslandTruck.Obstacles.Beer;
import org.academiadecodigo.ThirdIslandTruck.Obstacles.GameObstacle;
import org.academiadecodigo.ThirdIslandTruck.Obstacles.ObstaclesFactory;
import org.academiadecodigo.simplegraphics.pictures.Picture;

import java.util.LinkedList;

public class Game {

    public static final int ROAD_MIN_Y = 285;
    public static final int ROAD_HEIGHT = 703;
    public static final int TOTAL_OBS = 15;
    public static int beerCounter = 0;
    private int nextObstacle;
    private ObstaclesFactory factory;
    private Truck truck;
    private Road road;
    private LinkedList<GameObstacle> activeList;
    private int counter = 0;
    private boolean gameStarter;
    private Picture firstbeer;
    private Picture middlebeer;
    private Picture fullbeer;

    public Game() {
        activeList = new LinkedList<>();
        beerCounter = 0;
        nextObstacle = 0;
        gameStarter = false;

    }

    public void start() {
        gameStarter = false;
        road = new Road();
        truck.showTruck();

        activeList.get(nextObstacle).showObstacle();
        while (true) {
            showBeer();

            moveAllObstacles();

            if (checkCollisions()) {
                break;
            }

            getNewObstacle();


            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();

            }
            counter++;

        }
    }


    public void end() {
        Picture picture = new Picture(10, 10, "resources/gameover.png");
        picture.draw();
    }

    public void mainMenu() {
        Picture picture = new Picture(10, 10, "resources/MainMenu.jpg");
        truck = new Truck();
        new KeyboardListener(truck, this);
        while (!gameStarter) {
            picture.draw();
        }
    }


    public void init() {
        factory = new ObstaclesFactory();
        for (int i = 0; i < TOTAL_OBS; i++) {
            activeList.add(factory.createObstacle());

        }

        firstbeer = new Picture(20, 20, "resources/Emptybeer.png");
        middlebeer = new Picture(16, 20, "resources/Middlebeer.png");
        fullbeer = new Picture(20, 20, "resources/Fullbeer.png");
    }

    public void showBeer() {
        if (beerCounter <= 2) {
            firstbeer.draw();
            return;

        }
        firstbeer.delete();
        if (beerCounter <= 4) {
            middlebeer.draw();
            return;

        }
        middlebeer.delete();
        if (beerCounter > 4) {
            fullbeer.draw();
        }
    }

    private void moveAllObstacles() {
        for (GameObstacle obstacle : activeList) {
            obstacle.move();
        }

    }

    private boolean checkCollisions() {
        for (GameObstacle obstacle : activeList) {

            if (obstacle.checkPosition()) {
                continue;
            }

            if (obstacle.checkCollisions(truck)) {
                if (obstacle instanceof Beer) {
                    beerCounter++;
                    obstacle.hideObstacle();
                    obstacle.moveTo(948, Util.getRandom(313, 650));
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    private void getNewObstacle() {

        if (counter == 100) {
            nextObstacle++;
            if (nextObstacle >= TOTAL_OBS) {
                nextObstacle = 0;
            }
            activeList.get(nextObstacle).showObstacle();
            counter = 0;

        }

    }

    public void startGame() {
        gameStarter = true;
    }
}

