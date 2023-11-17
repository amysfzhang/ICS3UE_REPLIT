/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author amy
 */
public class Aug21Method2 {

  /**
  @param intA is a Positive integer > 0
  @param intB is a Positive integer > 0
  return the Greatest Common Divisor of intA and intB

  **/
    public static int GCD(int intA, int intB){
        for (int i = Math.min(intA, intB); i > 1; i--){
          if (intA % i == 0 && intB % i == 0){
            return i;
          }
        }
        return 1;
    }
    public static void main(String[] args) {
        System.out.println(GCD(2,3)); //1
        System.out.println(GCD(10,25)); // 5
    }
}
