/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author amy
 */
public class Aug14 {

    /**
    @param intA is a Positive integer
    @parem intB is a Positive integer > 0
    return intA % intB without using the % operators
    **/
    public static int myMod(int intA, int intB){
      int intMod = intA - (intB * (intA / intB));
      return intMod;
    }

    public static void main(String[] args) {
      System.out.println(myMod(10, 5)); //0
      System.out.println(myMod(2, 3)); // 2
    }
}
