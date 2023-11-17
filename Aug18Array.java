/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
import java.util.Scanner;

/**
 *
 * @author amy
 */
public class Aug18Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int [] intBurgerCalArr = {0, 461, 431, 420, 0};
        int [] intDrinkCalArr = {0, 130, 160, 118, 0};
        int [] intSideCalArr = {0, 100, 57, 70, 0};
        int [] intDessertCalArr = {0, 167, 266, 75, 0};

        int intBC = input.nextInt();
        int intDC = input.nextInt();
        int intSD = input.nextInt();
        int intDEC = input.nextInt();

        int intTotal = intBurgerCalArr[intBC];
        intTotal += intDrinkCalArr[intDC];
        intTotal += intSideCalArr[intSD];
        intTotal += intDessertCalArr[intDEC]; 

        System.out.println("Your total Calorie count is "+ intTotal);
    }

}
