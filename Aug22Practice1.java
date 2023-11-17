/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author amy
 */
public class Aug22Practice1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int intA = 0;
        Scanner input = new Scanner(System.in);

        int intH = input.nextInt();
        int intM = input.nextInt();    

        int i = 1;
        boolean isValid = false;

        while(i < intM && !isValid)
        {
            if ((-6 * Math.pow(i,4)) + (intH * Math.pow(i,3)) + (2* Math.pow(i,2)) + i <= 0)
            {
                isValid = true;
            }
            else
            {
                i++;
            }
        }

        if (isValid){
            System.out.println("The balloon first touches ground at hour:\n" + i);
        }
        else
        {
            System.out.println("The balloon does not touch ground in the given time.");
        }
    }
}
