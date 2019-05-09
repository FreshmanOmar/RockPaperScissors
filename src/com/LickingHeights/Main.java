package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //declare
        String RPS;//Rock Paper Scissors
        Scanner input;
        //initializing


        //the Users Choice
        input = new Scanner(System.in);
         System.out.println("You are Playing Rock paper Scissors against a computer!\n" +
                 "Choose either Rock Paper or Scissors");
        RPS = input.nextLine();


        //The Computers Choice
        int Compchoice = CompRPS();
        System.out.println(Compchoice);

        String Choice = theExactChoice(Compchoice);
        System.out.println(Choice);

        }
        public static int CompRPS() {
       int  rpsChooser = (int) (Math.random()*12);
       return rpsChooser;
    }
    public static String theExactChoice(int Choice) {
        switch (Choice){
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
                return"Scissors";
                }


    return null;}































































































































































































}

