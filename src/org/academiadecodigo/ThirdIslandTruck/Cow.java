package org.academiadecodigo.ThirdIslandTruck;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Cow extends GameObstacles {
    //private Rectangle cow;

    public Cow() {
        super(new Picture( 948, (int)(Math.random() * (690 - 313) + 313), "resources/cow.png"));

    }
}
