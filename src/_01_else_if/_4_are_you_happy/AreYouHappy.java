package _01_else_if._4_are_you_happy;

import javax.swing.JOptionPane;

public class AreYouHappy {
	public static void main(String[] args) {
	
		String bob = JOptionPane.showInputDialog("Are you happy? Answer in yes or no.");
		if(bob.equalsIgnoreCase("yes")) {
			JOptionPane.showMessageDialog(null, "Keep doing whatever you are doing");
		}
		else if(bob.equalsIgnoreCase("no")) {
			String jeff = JOptionPane.showInputDialog("Do you want to be happy?");
			if(jeff.equalsIgnoreCase("yes")) {
				JOptionPane.showMessageDialog(null, "Change something");
			}
			else if(jeff.equalsIgnoreCase("no")) {
				JOptionPane.showMessageDialog(null, "keep doing whatever you are doing");
			}
			else {
				JOptionPane.showMessageDialog(null, "That is not a yes or no brother");
			}
		}
		else {
			JOptionPane.showMessageDialog(null, "That is not a yes or no brother");
		}
	
	
	
	
	
	

	
	
	
	
	
	
	}

}