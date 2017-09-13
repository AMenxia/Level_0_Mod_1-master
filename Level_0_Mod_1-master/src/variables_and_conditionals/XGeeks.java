package variables_and_conditionals;

import javax.swing.JOptionPane;

/*
 * Everyone has a superpower. Mine is writing recipes. This program will store
 * the superpowers of all the people in the classroom. E.g. When I type "June",
 * your program should say "June's superpower is writing recipes".
 */
public class XGeeks {
public static void main(String[] args) {

        // 1. Save the superpower for each person in a variable.
String June = "Flying";
String Zed = "Shadow Clones";
String Kayne = "Walk walking";
String Ivern = "Being a Tree";
        // 2. Ask the user to enter a name. Store their answer in a variable.
String Charater = JOptionPane.showInputDialog("You have just met these characters from leage of ledgens in real life,Zed, June, Kayne, and Ivern. You can find out their super powers IRL by typing their name in this message box");
        // 3. Show the superpower in a pop-up, depending on the name entered. 
if (Charater.equalsIgnoreCase("zed")){
	JOptionPane.showInputDialog(Zed);

}
else if (Charater.equalsIgnoreCase("kayne")){
	JOptionPane.showInputDialog(Kayne);

}
else if (Charater.equalsIgnoreCase("June")){
	JOptionPane.showInputDialog(June);

}
else if (Charater.equalsIgnoreCase("Ivern")){
	JOptionPane.showInputDialog(Ivern);

}

    }
}
