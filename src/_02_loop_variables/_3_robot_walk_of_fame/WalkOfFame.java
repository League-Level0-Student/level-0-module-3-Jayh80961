
package _02_loop_variables._3_robot_walk_of_fame;

import org.jointheleague.graphical.robot.Robot;

public class WalkOfFame {
	public static void main(String[] args) {
		Robot rob = new Robot();
		rob.setSpeed(30);
		// 1. Set the X position of the robot so that it starts on the left. 
		rob.setX(100);
		rob.setY(200);
		// You also need to show the robot to see the result of this line.
		rob.setPenWidth(2);
		// 2. Make the robot draw a star shape. Hint: angle=144.
		for(int i=2;i<10;i++) {
			for (int z=0;z<5;z++) {
			rob.penDown();
			rob.turn(216);
			rob.move(30);
			
			
			}
			rob.setX(i*100);
			rob.setY(200);
		}
		
		// 3. Set the length of each line in the star to 30.

		/** THE CHALLENGE: **/
		/*
		 * Make the robot draw a line of stars like this:
		 * http://bit.ly/RobotWalk
		 * 
		 * Hint: The distance between stars is 50.
		 */

	}

}
