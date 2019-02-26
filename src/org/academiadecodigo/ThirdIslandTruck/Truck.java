package org.academiadecodigo.ThirdIslandTruck;

import org.academiadecodigo.simplegraphics.graphics.Movable;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Truck {
    private boolean drunk;
    private boolean crashed;
    private int drinkedBeers;
    private Picture truck;


    public Truck() {
        this.drunk = false;
        this.crashed = false;
        this.drinkedBeers = 0;
        truck = new Picture(20, 200, "/Users/codecadet/Desktop/ThirdIslandTruck/ThirdIslandTruck/sources/OldTruck.png" );
        truck.draw();
        KeyboardListener listener = new KeyboardListener(truck);

    }

    public void crash() {
        this.crashed = true;

    }

    public boolean isCrashed() {
        return crashed;

    }

}
