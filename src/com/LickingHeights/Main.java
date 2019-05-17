package com.LickingHeights;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        do {
            String RPS;//Rock Paper Scissors
            Scanner input;
            int total;

            //the Users Choice
            input = new Scanner(System.in);
            System.out.println("Choose either Rock Paper or Scissors");

          RPS = input.nextLine();
          System.out.println(RPS);
          String[] RandArray = {RPS};
            for (int i = 0; i < RandArray.length; i++){
                 total = RandArray[i].length();
                 System.out.println(total);
                 }
                 String UChoice = UserChoice(RandArray);
            System.out.println(UChoice);
            




                 //The Computers Choice
            System.out.println("comp");
            int Compchoice = CompRand();
            System.out.println(Compchoice+",");
            String WordChoice = Intconverter(Compchoice);
            System.out.println(WordChoice);
            String[] computer = {WordChoice};
            for (int i = 0; i < computer.length; i++){
                System.out.print(i);System.out.println(",");}

        } while(7==7);
        }  public static int CompRand () {
    int rpsChooser = (int) (Math.random() * 12);
    return rpsChooser;
}



    public static String Intconverter(int Array) {
        switch (Array) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                return "Rock";
            case 5:
            case 6:
            case 7:
            case 8:
                return "Paper";
            case 9:
            case 10:
            case 11:
            case 12:
                return "Scissors";
            default:}
                return null;}


    public static String UserChoice(String[] Array) {
    int total;
    for (int i = 0; i < Array.length; i++){
            total = Array[i].length();
            switch (total){
                case 3:
                case 4:
                   return "Rock";

                case 5:
                case 6:
                    return "Paper";

                case 7:
                case 8:
                case 9:
                   return "Scissors";
                default:return "invaild";
            }
        }


    return null;}
































































































































}






























































