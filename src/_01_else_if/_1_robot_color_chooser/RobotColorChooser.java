
package _01_else_if._1_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		
		//1. Create a new Robot
		Robot robot = new Robot();
	    //2. Make the robot draw a shape (this will take more than one line of code)
		robot.setX(240);
		robot.setY(400);
		robot.setPenWidth(10);
		robot.setSpeed(20);
		for(int i=0;i< 30;i++){
		String bob = JOptionPane.showInputDialog("choose colors between red,blue, and green.");
		if(bob.equals("green")) {
			robot.setPenColor(Color.green);
		}
		else if(bob.equals("blue")) {
			robot.setPenColor(Color.blue);
		}
		else if(bob.equals("red")) {
			robot.setPenColor(Color.red);
		}
		else {
			JOptionPane.showMessageDialog(null, "That color is not provided so the color will be random!!!");
			robot.setRandomPenColor();
		}
		robot.penDown();
		for(int z=0;z< 4;z++){
			robot.move(250);
			robot.turn(90);
		}
		}
		//3. Set the pen width to 10
		//4. Ask the user what color pen they would like the robot to draw with
		//5. Use an if/else statement to set the pen color that the user requested
        //6. If the user doesn’t enter anything, choose a random color
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		

		



	}
}
