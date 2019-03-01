package org.academiadecodigo.ThirdIslandTruck.Obstacles;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class OldLady extends GameObstacle {

    public OldLady() {
        super(new Picture(968, (int)(Math.random() * (650 - 313) + 313), "resources/grandma.png"));

    }

}