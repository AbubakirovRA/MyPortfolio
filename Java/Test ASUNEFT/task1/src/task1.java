package task1.src;

/*
  * task1
  * Вводится целое число, 
  * обозначающее код символа по таблице ASCII. 
  * Определить, это код английской буквы или какой-либо иной символ.
  */

public class task1 {
 
    public static void main(String[] args){
        char ch = (char) getInt.request();
        System.out.println(checkChar(ch));
            
    }

    public static String checkChar(char ch){
        String str = "Not English Letter";
        if (ch > 64 && ch < 91 || ch > 96 && ch < 123){
            str = "English letter";
        }
        return str;
    }
 }