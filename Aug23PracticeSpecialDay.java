/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author amy
 */
public class Aug23PracticeSpecialDay {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        int intMonth = input.nextInt();
        int intDay = input.nextInt();

        if (intMonth < 2){
            System.out.println("Before");
        }
        else if (intMonth > 2 ){
            System.out.println("After");
        }
        else if (intDay < 18){
            System.out.println("Before");
        }
        else if (intDay > 18){
            System.out.println("After") ;     
        }
        else{
            System.out.println("Special");
        }
    }
}
