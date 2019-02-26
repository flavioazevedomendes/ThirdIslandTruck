package org.academiadecodigo.ThirdIslandTruck;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Road {
    private Picture road;
    private Picture background;
    private Rectangle rectangle;

    public Road() {
        background = new Picture(10, 10, "resources/background.png");
        background.draw();
        road = new Picture(10, 313, "resources/lul.jpg");
        road.draw();

    }

}
