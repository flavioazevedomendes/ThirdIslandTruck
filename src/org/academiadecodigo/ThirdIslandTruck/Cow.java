package org.academiadecodigo.ThirdIslandTruck;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Cow extends GameObstacles {
    //private Rectangle cow;

    public Cow() {
        super(new Picture( 968, (int)(Math.random() * (713 - 313) + 313), "resources/cow.png"));

    }
}
