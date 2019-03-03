package org.academiadecodigo.ThirdIslandTruck;


public class Main {
    public static void main(String[] args) {

        Game game = new Game();
        game.init();
        game.mainMenu();
        Sound sound = new Sound("/resources/Sound/MainMusic.wav");
        sound.play(true);
        game.start();
        sound.stop();
        Sound end = new Sound("/resources/Sound/endMusic.wav");
        end.play(true);
        game.end();

    }
}
