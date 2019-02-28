package org.academiadecodigo.ThirdIslandTruck;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class OldLady extends GameObstacles {

    public OldLady() {
        super(new Picture(968, (int)(Math.random() * (650 - 313) + 313), "resources/grandma.png"));

    }

}