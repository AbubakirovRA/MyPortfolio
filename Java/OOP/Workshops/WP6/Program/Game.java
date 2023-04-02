package Workshops.WP6.Program;
import java.io.Serializable;
import java.util.Random;

public class Game implements Model, Serializable {
    private int attempts, r;
    private boolean status;

    public Game() {
        this(5);
    }

    public Game(int attempts) {
        this.attempts = attempts;
        this.r = new Random().nextInt(1, 11);
        System.out.println(r);
        this.status = true;
    }

    public boolean gameStatus() {
        return status;
    }

    public String answerLine(int received) {
        if (received == r) {
            status = false;
            return String.format("You are a winner!! You guessed the hidden number -  %d!\n", received);
        } else if (checkUp()) {
            return "Your attempts have ended, you have failed!\n";
        } else if (received > r) {
            return String.format("Your Number less than My Number - %d\n enter Your Number! You have attempts left - %d\n", received, status);
        } else if (received < r) {
            return String.format("Your Number greater than My Number - %d\n enter Your Number! You have attempts left - %d\n", received, status);
        }
        return "You have entered something wrong, try one more.\n";
    }

    private boolean checkUp() {
        attempts -= 1;
        if (attempts == 0) {
            status = false;
            return true;
        }
        return false;
    }
}
