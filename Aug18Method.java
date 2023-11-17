/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author amy
 */
public class Aug18Method {

    /**
   @param intArr is an integer array
   return True if all the elements in the array is even else return false

  **/
    public static boolean isAllEven(int [] intArr){
        //Goes through each element in the array
        for (int i = 0; i < intArr.length - 1; i++)
        {
          //Checks if the element is odd
          if (intArr[i] % 2 == 1)
          {
            //returns false if odd
            return false;
          }
        }
        //returns true, if none are odd
        return true;
    }

    public static void main(String[] args) {
        int [] intArr1 = {2,4,6,8};
        int [] intArr2 = {1,2,3,4,5};
        int [] intArr3 = {1,3,5,7};
        System.out.println(isAllEven(intArr1));
        System.out.println(isAllEven(intArr2));
        System.out.println(isAllEven(intArr3));
    }
}
