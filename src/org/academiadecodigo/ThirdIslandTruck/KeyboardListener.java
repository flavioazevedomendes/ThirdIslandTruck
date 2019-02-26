package org.academiadecodigo.ThirdIslandTruck;

import org.academiadecodigo.simplegraphics.graphics.Movable;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class KeyboardListener implements KeyboardHandler {

    private Truck truck;

    public KeyboardListener(Truck truck) {
        this.truck = truck;

        KeyboardEvent up = new KeyboardEvent();
        up.setKey(KeyboardEvent.KEY_UP);
        up.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);


        KeyboardEvent down = new KeyboardEvent();
        down.setKey(KeyboardEvent.KEY_DOWN);
        down.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);


        Keyboard keyboard = new Keyboard(this);
        keyboard.addEventListener(up);
        keyboard.addEventListener(down);

    }

    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {

        switch (keyboardEvent.getKey()) {
            case KeyboardEvent.KEY_DOWN:
                truck.setDirection(Direction.DOWN);
                break;
            case KeyboardEvent.KEY_UP:
                truck.setDirection(Direction.UP);

        }

    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {
        truck.setDirection(null);
    }
}
