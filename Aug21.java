/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author amy
 */
public class Aug21 {

    /**
     A programmer wants to create a method that is called doesItQualify. The method receives a string and two doubles (in that order) and returns a Boolean value back to the main program. Write the method definition for the doesItQualify. You don't need the body of the method
     A programmer want to create a method called subTotal, which receives the price of item as double and the tax rate as a double. Write a method defintion and the bofy of the method so that it will return subTotal of the purchased item

    **/

    /** 
    @param dblPrice The price of an item
    @param dblTaxRate The tax rate of an item
    @return the subTotal of the dblPrice
    **/
    //public static boolean doesItQualify(String str, double dbl1, double dbl2){}

    public static double subTotal(double dblPrice, double dblTax){
        return dblPrice * (1 + dblTax);
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}
