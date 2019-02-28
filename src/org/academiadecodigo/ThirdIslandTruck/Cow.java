package org.academiadecodigo.ThirdIslandTruck;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Cow extends GameObstacle {

    public Cow() {
        super(new Picture( 948, (int)(Math.random() * (650 - 313) + 313), "resources/cow.png"));

    }
}
