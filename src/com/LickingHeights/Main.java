package com.LickingHeights;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {



            String RPS;//Rock Paper Scissors
            Scanner input;
            int total = 0;
            int answer = 0;
            String Query;

                do {

                //the Users Choice
                input = new Scanner(System.in);
                System.out.println("Choose Rock Paper Scissors:");
                RPS = input.nextLine();
                //System.out.println(RPS);
                String[] RandArray = {RPS};
                for (int i = 0; i < RandArray.length; i++) {
                    total = RandArray[i].length();
                    //System.out.println(total);
                }
                String UChoice = UserChoice(RandArray);
                System.out.println("\nYou choose " + UChoice);

                //The Computers Choice
                int Compchoice = CompRand();
                // System.out.println(Compchoice+",");
                String WordChoice = Intconverter(Compchoice);
                System.out.println("\nThe computer choose " + WordChoice);
           /* String[] computer = {WordChoice};
            for (int i = 0; i < computer.length; i++){
                System.out.print(i);System.out.println(",");
            }*/

                System.out.println(Compare(Compchoice, total));
                System.out.println("\nDo you wish to continue?");
                Query = input.nextLine();
                String[] restart = {Query};
                for (int i = 0; i < restart.length; i++) {
                    answer = restart[i].length();

                }
                } while (answer == 3);
            String[] restart = {Query};
            for (int i = 0; i < restart.length; i++) {
                answer = restart[i].length();
                }if (answer == 2 ){System.out.println("\nThanks for Playing");}



        }  public static int CompRand () {
    int rpsChooser = (int) (Math.random() * 2);
    return rpsChooser;
}
public static String Intconverter(int Array) {
        switch (Array) {
            case 0:
                return "Rock";
            case 1:
                return "Paper";
            case 2:
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
        public static String Compare(int Choice,int Total) {
        if(Choice == 0 && (Total == 3 || Total == 4) ){return  "That's A Tie";
        }else if (Choice == 1 && (Total == 5 || Total == 6) ){return "That's A Tie" ;
        }else if (Choice == 2 && (Total == 7 || Total == 8 || Total == 9)){ return "That's A Tie";
        }else if (Choice == 0 && (Total == 7 || Total == 8 || Total == 9)){return "\nRock Beats Scissor:\n You Lost!";
        }else if (Choice == 0 && (Total == 5 || Total == 6)){return "\nPaper Beats Rock:\n You Won!";
        }else if (Choice == 1 && (Total == 3 || Total == 4)){return"\nPaper Beats Rock:\n You Lost!";
        }else if (Choice == 1 && (Total == 7 || Total == 8 || Total == 9)){return "\nScissor Beats Paper:\n You Won!";
        }else if (Choice == 2 && (Total == 3 || Total == 4)){return "\nRock  Beats Scissor:\n You Won!";
        }else if (Choice == 2 && (Total == 5 || Total == 6)){return "\nScissor Beats Paper:\n You Lost!";
        }
        return null;
    }

































































































































}






























































