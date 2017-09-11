package variables_and_conditionals;

/** 
I have a pocket full of change. I hate doing math. Make me a program that will calculate 
how much money I have without me having to use my brain.
*/

import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {

    public static void main(String[] args) {

        // Ask the user how many nickels they have
String Nickles = JOptionPane.showInputDialog(null,"How many nickles do you have?");
        // Convert their answer to an int using Integer.parseInt()
int numNickles = Integer.parseInt(Nickles);
        // Ask the user how many dimes they have, and convert their answer
String Dimes = JOptionPane.showInputDialog("How many dimes do you have?");
int numDimes = Integer.parseInt(Dimes);
        // Ask the user how many quarters they have, and convert their answer
String Quarters = JOptionPane.showInputDialog("How many quarters do you have?");
int numQuarters = Integer.parseInt(Quarters);
        // Calculate how much money the user has and save it in a double variable 
        double numQuarters1 = (numQuarters*.25);
        double numDimes1 =  (numDimes*.1);
        double numNickles1 =  (numNickles*.05);
        double totalMoney =  (numQuarters1+numDimes1+numNickles1);
        // Tell the user how much money they have
System.out.println(totalMoney);
    }
}