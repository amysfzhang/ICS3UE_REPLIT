/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author amy
 */
public class Aug23PracticeRobaparskat {
    public static void main(String args[]) {
        String strAlphabet = "abcdefghijklmnopqrstuvwxyz";
        String strClosestVowel = "aaaeeeeiiiiioooooouuuuuuu";//Hard coded closest vowels
        String strFinal = "";//Stores the final string

        Scanner input = new Scanner(System.in);

        String strInput = input.nextLine();

        int intNextCon = 1;

        //Goes through each letter of the word
        for (int i = 0; i < strInput.length(); i++)
        {
            String strLetter = strInput.substring(i,i+1);

            //Checks if it is a constanent
            if ("aeiou".indexOf(strLetter) == -1)
            {
                //Add the letter
                strFinal += strLetter;
                //Add the vowel closest to the letter
                strFinal += strClosestVowel.charAt(strAlphabet.indexOf(strLetter));
                //Goes through intNextCon number of letters after until it finds another constantent
                while("aeiou".indexOf(strAlphabet.charAt(strAlphabet.indexOf(strLetter) + intNextCon)) != -1)
                {
                    intNextCon++;
                }
                //Adds the constanent to the final string
                strFinal += strAlphabet.charAt(strAlphabet.indexOf(strLetter) + intNextCon);
            }
            else //if a vowel, add it to the final as is
            {
                strFinal += strLetter;
            }
            //Resets the counter to 1 for the next letter
            intNextCon = 1;
        }

        System.out.println(strFinal);

    }
}
