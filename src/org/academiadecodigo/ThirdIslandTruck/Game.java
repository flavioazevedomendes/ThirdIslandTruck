package org.academiadecodigo.ThirdIslandTruck;

import org.academiadecodigo.ThirdIslandTruck.Obstacles.GameObstacle;
import org.academiadecodigo.ThirdIslandTruck.Obstacles.ObstaclesFactory;
import org.academiadecodigo.simplegraphics.pictures.Picture;

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
                if (obstacle1.collide(truck)){
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

    public void end(){
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

}

