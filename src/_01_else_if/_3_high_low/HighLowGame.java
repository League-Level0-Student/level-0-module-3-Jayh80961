
package _01_else_if._3_high_low;

import java.util.Random;

import javax.swing.JOptionPane;

public class HighLowGame {

	public static void main(String[] args) {
		// 3. Change this line to give you a random number between 1 - 100.
		String bob; 
		int random = new Random().nextInt(101);
		// 2. Print out the random variable above
		
		// 11. Repeat steps 1 to 10 ten times
			for(int i=0;i<10;i++){
			
			// 1. Ask the user for a guess using a pop-up window, and save their response 
			
			// 4. Convert the users’ answer to an int (Integer.parseInt(string))
			bob = JOptionPane.showInputDialog("Guess a number between 1-100");
			JOptionPane.showMessageDialog(null, "The number you chose : "+ bob);	
			int bobAsInt = Integer.parseInt(bob);
			
			// 5. if the guess is correct
			if(bobAsInt == random) {
				JOptionPane.showMessageDialog(null, "You win!!!");
				System.exit(0);
			}
			else if(bobAsInt>random) {
				JOptionPane.showMessageDialog(null, "it's too high");
			}
			else {
				JOptionPane.showMessageDialog(null, "it's too low");
			}
				// 6. Win
				// 12. Use "System.exit(0);" to quit the game if the user guessed the right answer.
			// 7. if the guess is high
				// 8. Tell them it's too high
			// 9. if the guess is low
				// 10. Tell them it's too low
			}
			JOptionPane.showMessageDialog(null, "You lose!!!!!");
		// 13. Tell them they lose
		
	}

}


