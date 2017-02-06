import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

/**
 * Created by Sharron` on 2/3/2017.
 */
public class Lab5 {
    public static void main(String[] args) {
        System.out.println("Welcome to Grouchos Casino");

        //1. prompt user for number of side of dice
        System.out.println("How many sides should each dice have?");

        //2. get user input
        Scanner scan = new Scanner(System.in);
        int sides = scan.nextInt();

        String procede = "y";//use for while loop to work
        while(procede.equals("y")) {

            //3. prompt user to roll the dice
            System.out.println("Press any number to roll dice");

            //4.get user input
            scan.nextInt();

            //5. peform dice roll/ roll dice
            int result1 = diceRoll(sides);//calling a method
            int result2 = diceRoll(sides);//calling a method

            //6. display results
            System.out.println("result1 = " + result1);
            System.out.println("result2 = " + result2);

            //7.prompt user to continue/get user choice
            System.out.println("continue? (y/n):");
            procede = scan.next();

        }
    }
    public static int diceRoll(int sides) {
        //generate random number here and assign to number variable
        int n = (int)((Math.random() * sides) + 1);
        return n;


    }


}
