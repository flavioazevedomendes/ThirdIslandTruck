package org.academiadecodigo.ThirdIslandTruck;

import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;

public class KeyboardListener implements KeyboardHandler {

    private Truck truck;
    private Game game;

    public KeyboardListener(Truck truck, Game game) {
        this.truck = truck;
        this.game = game;

        KeyboardEvent space = new KeyboardEvent();
        space.setKey(KeyboardEvent.KEY_SPACE);
        space.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);


        KeyboardEvent up = new KeyboardEvent();
        up.setKey(KeyboardEvent.KEY_W);
        up.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);


        KeyboardEvent down = new KeyboardEvent();
        down.setKey(KeyboardEvent.KEY_S);
        down.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);


        Keyboard keyboard = new Keyboard(this);
        keyboard.addEventListener(up);
        keyboard.addEventListener(down);
        keyboard.addEventListener(space);

    }

    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {

        switch (keyboardEvent.getKey()) {
            case KeyboardEvent.KEY_S:
                if (Game.beerCounter >= 6) {
                    truck.setDirection(Direction.UP);
                    break;
                }
                truck.setDirection(Direction.DOWN);
                break;
            case KeyboardEvent.KEY_W:
                if (Game.beerCounter >= 6) {
                    truck.setDirection(Direction.DOWN);
                    break;
                }
                truck.setDirection(Direction.UP);
                break;
            case KeyboardEvent.KEY_SPACE:
                game.startGame();
        }

    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {
        truck.setDirection(null);
    }
}
