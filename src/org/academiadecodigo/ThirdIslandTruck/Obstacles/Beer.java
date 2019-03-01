package org.academiadecodigo.ThirdIslandTruck.Obstacles;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Beer extends GameObstacle {

    public Beer() {
        super(new Picture( 948, (int)(Math.random() * (650 - 313) + 313), "resources/beer.png"));

    }
}
