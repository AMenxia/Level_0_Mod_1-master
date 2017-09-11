package variables_and_conditionals;

import java.util.Random;

import javax.swing.JOptionPane;

import org.omg.CORBA.SystemException;

public class Majix_8ball_ {

    // 1. Make a main method that includes all the steps belowâ€¦.
	public static void main(String[] args) {
		
	
    // 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
Random number = new Random();
int randomnumber = number.nextInt(3);
    // 3. Print out this variable
System.out.println(number);


    // 4. Get the user to enter a questioan for the 8 ball
String input = JOptionPane.showInputDialog("Ask a question!");
    // 5. If the random number is 0
 if (randomnumber == 0){
 System.out.println("yes");
 }
    // -- tell the user "Yes"

    // 6. If the random number is 1
 else if(randomnumber == 1){
	 System.out.println("no");
 }
    // -- tell the user "No"

    // 7. If the random number is 2
 else if(randomnumber == 2){
	 System.out.println("maybe you should ask google");
 }
    // -- tell the user "Maybe you should ask Google?"

    // 8. If the random number is 3
 else if(randomnumber == 3){
	 System.out.println("the answer was in your last nights dream");
 }
    // -- write your own answer

}
}
