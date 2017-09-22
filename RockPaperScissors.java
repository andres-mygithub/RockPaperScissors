package com.frixione;
import java.util.*;

public class RockPaperScissors {

    private static void checkResult(String name, String userPick, int user, String compPick, int comp)
    {
        int result = user + comp;
        String winner = "Computer";
        String resultStr = "";

        if (result % 2 == 1)
        {
            resultStr = "odd";

            if(userPick.equals("0"))
            {
                winner = name;
            }
            else if (userPick.equals("E"))
            {
                winner = "Computer";
            }
        }
        else if (result % 2 == 0)
        {
            resultStr = "even";

            if(userPick.equals("E"))
            {
                winner = name;
            }
            else if (userPick.equals("0"))
            {
                winner = "Computer";
            }
        }

        System.out.println(user + " + " + comp + " = " + result);
        System.out.println(result + "..." + resultStr + "!");
        System.out.println("This means " + winner + " wins! :)");
    }

    public static void main(String[] args)
    {
        System.out.println("Let’s play a game called “Odds and Evens”");
        System.out.print("What is your name? ");

        Scanner input = new Scanner(System.in);
        String name = input.nextLine();

        System.out.println("Hi " + name + ", which do you choose? (O)dds or (E)vens?");

        String userPick = input.next();
        String compPick = "";

        if(userPick.equalsIgnoreCase("O"))
        {
            System.out.println(name + " has picked Odds! The computer will be evens.");
            compPick = "E";
        }
        else
        {
            System.out.println(name + " has picked Evens! The computer will be odds.");
            compPick = "O";
        }
        System.out.println("-----------------------------------------");

        System.out.print("How many fingers do you put out? ");
        int userFingers = input.nextInt();

        Random rand = new Random();
        int computerFingers = rand.nextInt(6);
        System.out.println("The computer plays " + computerFingers + " fingers.");
        System.out.println("-----------------------------------------");

        checkResult(name, userPick, userFingers, compPick, computerFingers);
    }
}
