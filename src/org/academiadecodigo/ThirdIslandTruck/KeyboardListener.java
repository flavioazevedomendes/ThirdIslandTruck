package org.academiadecodigo.ThirdIslandTruck;

import org.academiadecodigo.simplegraphics.graphics.Movable;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class KeyboardListener implements KeyboardHandler {

    Movable movable;

    public KeyboardListener(Movable movable) {
        this.movable = movable;

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
                movable.translate(0, 8);
                break;
            case KeyboardEvent.KEY_UP:
                movable.translate(0, -8);

        }

    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }
}
