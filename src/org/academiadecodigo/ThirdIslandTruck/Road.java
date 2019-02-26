package org.academiadecodigo.ThirdIslandTruck;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Road {
    private Picture road;
    private Rectangle rectangle;

    public Road(){
    road = new Picture(10, 10, "/Users/codecadet/Desktop/ThirdIslandTruck/ThirdIslandTruck/sources/lul.jpg");
    road.draw();
    rectangle = new Rectangle(10,10 , 1018 ,400);
    rectangle.draw();

    }

}
