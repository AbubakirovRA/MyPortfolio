package Workshops.WP6.Program;

import java.util.Scanner;

public class TerminalPrint implements Viewer {
    private Scanner str = new Scanner(System.in);
    
    public String inputLine(String message){
        System.out.printf("%s", message);
        return str.next();
    }

    public void outputLine(String message){
        System.out.printf("%s", message);
    }

}