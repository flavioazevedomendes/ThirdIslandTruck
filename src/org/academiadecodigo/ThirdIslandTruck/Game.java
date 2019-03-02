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

    private int nextObstacle;
    private ObstaclesFactory factory;
    private Truck truck;
    private Road road;
    public static int beerCounter;
    private LinkedList<GameObstacle> activeList;
    private Picture firstbeer;
    private Picture middlebeer;
    private Picture fullbeer;

    public Game() {
        road = new Road();
        activeList = new LinkedList<>();
        beerCounter = 0;
        nextObstacle = 0;

    }

    public void start() {
        activeList.get(nextObstacle).showObstacle();
        int counter = 0;
        while (true) {
            showBeer();

            moveAllObstacles();


            if (counter == 90) {
                nextObstacle++;
                if (nextObstacle >= TOTAL_OBS) {
                    nextObstacle = 0;
                }
                activeList.get(nextObstacle).showObstacle();
                counter = 0;

            }

            try {
                Thread.sleep(9);
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


    public void init() {
        factory = new ObstaclesFactory();
        truck = new Truck();
        for (int i = 0; i < TOTAL_OBS; i++) {
            activeList.add(factory.createObstacle());

        }
    }

    public void showBeer() {
        if (beerCounter < 1) {
            firstbeer = new Picture(20, 20, "resources/Emptybeer.png");
            firstbeer.draw();
            return;

        }
        if (beerCounter <= 2) {
            firstbeer.delete();
            middlebeer = new Picture(20, 20, "resources/Middlebeer.png");
            middlebeer.draw();
            return;

        }
        if (beerCounter >= 3) {
            middlebeer.delete();
            fullbeer = new Picture(20, 20, "resources/Fullbeer.png");
            fullbeer.draw();
        }
    }

    private void moveAllObstacles() {
        for (GameObstacle obstacle : activeList) {
            obstacle.move();
            if (obstacle.checkPosition()) {
                continue;
            }

            if (obstacle.checkCollisions(truck)) {
                if (obstacle instanceof Beer) {
                    beerCounter++;
                    obstacle.hideObstacle();
                    obstacle.moveTo(948, Util.getRandom(313, 650));
                    System.out.println("checkCollisions " + beerCounter);
                    continue;
                }
                return;
            }
        }

    }
    

}

