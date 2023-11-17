
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author amy
 */
public class Aug10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        //Read 10 integer values from the user, calculate the average and print all the integers greater than the average
        //You can only used things I have taught so far to complete the task

        Scanner input = new Scanner(System.in);

        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        int num4 = input.nextInt();
        int num5 = input.nextInt();
        int num6 = input.nextInt();
        int num7 = input.nextInt();
        int num8 = input.nextInt();
        int num9 = input.nextInt();
        int num10 = input.nextInt();

        int intTotal= num1 + num2 + num3 + num4 + num5 + num6 + num7 + num8 + num9 + num10;
        double dblAvg = intTotal/10.0;

        if(num1 > dblAvg)
        {
          System.out.println(num1);
        }
        if(num2 > dblAvg)
        {
          System.out.println(num2);
        }
        if(num3 > dblAvg)
        {
          System.out.println(num3);
        }
        if(num4 > dblAvg)
        {
          System.out.println(num4);
        }
        if(num5 > dblAvg)
        {
          System.out.println(num5);
        }
        if(num6 > dblAvg)
        {
          System.out.println(num6);
        }
        if(num7 > dblAvg)
        {
          System.out.println(num7);
        }
        if(num8 > dblAvg)
        {
          System.out.println(num8);
        }
        if(num9 > dblAvg)
        {
          System.out.println(num9);
        }
        if(num10 > dblAvg)
        {
          System.out.println(num10);
        }
    }
}
