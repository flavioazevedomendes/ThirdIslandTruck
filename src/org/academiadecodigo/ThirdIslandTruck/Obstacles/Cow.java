package org.academiadecodigo.ThirdIslandTruck.Obstacles;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Cow extends GameObstacle {

    public Cow() {
        super(new Picture( 948, (int)(Math.random() * (650 - 313) + 313), "resources/Cow.png"));

    }
}
