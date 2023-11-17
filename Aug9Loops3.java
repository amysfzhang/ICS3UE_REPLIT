/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author amy
 */
public class Aug9Loops3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        //Print the first 10 Triangular Numbers using for loop
        //Triagnle numbers are the sum of all positive integers before it
          //Ex. a triangle with length 6 has total of 21 = 6 + 5 + 4 + 3 + 2 + 1

        int intTotal = 0; //Keeping track of sum of previous numbers

        for(int i = 1; i <= 10; i++) //Going through integers 1-10
        {
          System.out.println(i + intTotal);//Printing the Triangle number
          intTotal += i;//Adding i to intTotal
        }
    }
}
