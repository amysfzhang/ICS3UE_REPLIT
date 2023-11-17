/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author amy
 */
public class Aug18Method2 {

    /**
     * 
     * @param str is an non empty string
     * @param a is an integer
     * @param b is an integer
     * where a <= b
     * @return the substring between index a and b inclusive
     * You cannot use the build in substring
     */

    public static String mySubString(String str, int a, int b){
        String strTemp = "";
        for (int i = a; i <= b; i ++)
        {
          strTemp += str.charAt(i);
        }

        return strTemp;

    }
    public static void main(String[] args) {
        System.out.println(mySubString("stephen",1,3));
        System.out.println(mySubString("stephen",1,2));
        System.out.println(mySubString("stephen",1,1));
  }
}
