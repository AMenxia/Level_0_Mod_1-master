package for_loops;

import javax.swing.JOptionPane;

public class Quiz {
	public static void main(String[] args){
	String Greeting = "Welcome, you will be tested on your skills up to this current time, you must get atleast 1%, Continue or Quit?";
	int input1 = JOptionPane.showConfirmDialog(null, Greeting);
	String Quit = "Goodbye";
	String answer1 = "1667";
	System.out.println(input1);

	if(input1==0){
		
		String Continue = "Great, it beggins now, when was the US constitution Signed? (1667, 1889, 1508)?";
	 answer1 = JOptionPane.showInputDialog(Continue);
	 	if(answer1.equalsIgnoreCase("1667")) {
	 		
}
	}
/*Incase using letters instead of numbers*/
/*if(input1.equalsIgnoreCase("quit"));{
JOptionPane.showMessageDialog(null, Quit);
String answer1 = JOptionPane.showInputDialog(Greeting);
}*/
	 else if(input1==1 | input1==2){
		JOptionPane.showMessageDialog(null,Quit);
		}

}
}

