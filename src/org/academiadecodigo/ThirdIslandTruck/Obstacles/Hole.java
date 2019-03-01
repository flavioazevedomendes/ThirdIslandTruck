package org.academiadecodigo.ThirdIslandTruck.Obstacles;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Hole extends GameObstacle {

    public Hole() {
        super(new Picture( 948, (int)(Math.random() * (650 - 313) + 313), "resources/Holeone.png"));

    }
}
