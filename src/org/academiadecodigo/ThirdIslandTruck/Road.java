package org.academiadecodigo.ThirdIslandTruck;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Road {
    private Picture road;
    private Rectangle rectangle;

    public Road(){
    road = new Picture(10, 10, "resources/lul.jpg");
    road.draw();

    }

}
