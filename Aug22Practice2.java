/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author amy
 */
public class Aug22Practice2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        int intOpened = input.nextInt();
        int [] intPrizesArr = {100, 500, 1000, 5000, 10000, 25000, 50000, 100000, 500000, 1000000};
        int intTemp = 0;
        double dblTotal = 1691600;

        for (int i = 0; i < intOpened; i++){
            intTemp = input.nextInt();
            dblTotal -= intPrizesArr[intTemp - 1];
        }

        int intOffer = input.nextInt();

        if (dblTotal / (10 - intOpened) > intOffer){
            System.out.println("no deal");
        } 
        else{
            System.out.println("deal");
        }
    }
}
