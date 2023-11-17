/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author amy
 */
public class Aug21Method3 {

    /**
    @ param intA is a an integer > 0
    @ param intB is an integer > 0
    return the LCM of intA and intB

    **/
    public static int getLcm(int intA, int intB){
        for (int i = Math.max(intA, intB); i < intA * intB; i++){
            if (i % intA == 0 && i % intB == 0){
                return i;
            }
        }
        return intA * intB;
      //return intA * intB / GCD(intA, intB);
    }
    public static void main(String[] args) {
        System.out.println(getLcm(2,3));//6
        System.out.println(getLcm(10,25));//50;
    }
}
