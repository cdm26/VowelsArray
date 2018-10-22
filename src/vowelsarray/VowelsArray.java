/*
 * Chris McDaniel
 * 12/20/17
 * Exam3 See if character is uppercase lowercase or is a vowel
 */
package vowelsarray;

import javax.swing.JOptionPane;

public class VowelsArray {

    public static void main(String[] args) {   
        String[] vowel = {"a", "e", "i", "o", "u","A", "E", "I", "O", "U"};   
        String character;
      
        character = JOptionPane.showInputDialog(null, "Enter a character"); // ask for vowel 
       
        if(vowel.equals(character)) // checks if character is a vowel
            JOptionPane.showMessageDialog(null, character + " is a vowel");
        else
             JOptionPane.showMessageDialog(null, character + " is not a vowel");
        
    }
    
}
