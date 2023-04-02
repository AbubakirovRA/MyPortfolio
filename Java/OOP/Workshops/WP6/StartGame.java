package Workshops.WP6;
import Workshops.WP6.Program.*;
import java.io.IOException;

public class StartGame {
    public static void main(String[] args) throws ClassNotFoundException, IOException {
        Engine<Game, TerminalPrint> Begin = new Engine<Game,TerminalPrint>(new Game(), new TerminalPrint());
        Begin.startGame();
    }
}
