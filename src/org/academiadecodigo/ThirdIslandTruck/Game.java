package org.academiadecodigo.ThirdIslandTruck;

import org.academiadecodigo.ThirdIslandTruck.Obstacles.Beer;
import org.academiadecodigo.ThirdIslandTruck.Obstacles.GameObstacle;
import org.academiadecodigo.ThirdIslandTruck.Obstacles.ObstaclesFactory;
import org.academiadecodigo.simplegraphics.pictures.Picture;

import java.util.LinkedList;

public class Game {

    public static final int ROAD_MIN_Y = 285;
    public static final int ROAD_HEIGHT = 703;

    private ObstaclesFactory factory;
    private Truck truck;
    private Road road;
    private LinkedList<GameObstacle> activeList;
    public static int beerCounter;

    public Game() {
        road = new Road();
        activeList = new LinkedList<>();
        beerCounter = 0;

    }

    public void start() {

        GameObstacle obstacle = factory.get();
        activeList.add(obstacle);
        int counter = 0;
        while (true) {
        showBeer();
            for (GameObstacle obstacle1 : activeList) {
                obstacle1.move();
                if (obstacle1.checkPosition()) {

                    continue;
                }

                if (obstacle1.collide(truck)) {
                    if (obstacle1 instanceof Beer) {
                        beerCounter++;
                        obstacle1.hideObstacle();
                        obstacle1.moveTo(-1, -1);
                        System.out.println("collide " + beerCounter);
                        continue;
                    }
                    return;
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

    public void end() {
        Picture picture = new Picture(10, 10, "resources/gameover.png");
        picture.draw();

    }

    private GameObstacle swapObstacle(GameObstacle obstacle) {
        factory.recycle(obstacle);
        return factory.get();
    }


    public void init() {
        factory = new ObstaclesFactory();
        factory.init();
        truck = new Truck();
    }

    public void showBeer() {
        if (beerCounter <=1 ) {
            Picture picture = new Picture(20,20, "resources/Emptybeer.png");
            picture.draw();
            return;

        }
        if (beerCounter <= 2) {
            Picture picture = new Picture(20,20, "resources/Middlebeer.png");
            picture.draw();
            return;

        }
        if (beerCounter >= 3) {
            Picture picture = new Picture(20,20, "resources/Fullbeer.png");
            picture.draw();
        }
    }
}

