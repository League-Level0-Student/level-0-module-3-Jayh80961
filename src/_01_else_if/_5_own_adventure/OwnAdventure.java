package _01_else_if._5_own_adventure;

import javax.swing.JOptionPane;

public class OwnAdventure {
	public static void main(String[] args) {
		String game = JOptionPane.showInputDialog("Would you like to try an adventure, to find the treasure?");
			if(game.equalsIgnoreCase("yes")){
				String jeff = JOptionPane.showInputDialog("Okay then, you see two paths infront of you, one has an arrow on it and the other doesn't, which do you choose to go? (Type left if the arrow and right if no arrow path.)");
				if(jeff.equalsIgnoreCase("left")) {
					String hi = JOptionPane.showInputDialog("You have chosen to follow the arrow, now you see a temple on the right side and a pyramid on the left. WHich one do you got to?(answer in left or right.)");
					if(hi.equalsIgnoreCase("right")) {
						JOptionPane.showMessageDialog(null, "You found the treasure in the temple!!!");
					}
					else {
						JOptionPane.showMessageDialog(null, "There was a moving mummy so you freaked out and died because your heart stoped.");
					}
				}
				else if(jeff.equalsIgnoreCase("right")) {
					JOptionPane.showMessageDialog(null, "You ran into a bear and died");
				}
			}
			if(game.equalsIgnoreCase("no")) {
				JOptionPane.showMessageDialog(null, "Press enter to quit the game");
			}
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
