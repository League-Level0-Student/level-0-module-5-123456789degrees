package _02_nested_loops._1_snowflake;

import org.jointheleague.graphical.robot.Robot;

public class Snowflake {
	
	public static void main(String[] args) {
		// #1. Make a new Robot

		Robot rob = new Robot();
		// #2. Set your robot’s position to x=300 and y=300
		rob.setX(300);
		rob.setY(300);
		// #3. Put the robot's pen down
		rob.penDown();
		rob.setSpeed(5);
		for (int i = 0; i < 6; i++) {
			rob.setPenColor(0,0,0);
			rob.move(50);
			rob.turn(60);
			if (i % 2 == 0) {
				rob.setPenColor(0,0,255);
			}
			else {
				rob.setPenColor(255,0,0);
			}
			for (int j = 0; j < 6; j++) {
				rob.turn(270);
				rob.move(50);
			}
		}
		rob.setPenColor(0,0,0);
		// #4. Set the robot’s speed to 5


		// #5. use a for loop below to do everything ( #6, #7, #8, #9, #12, #13, #14 ) 6 times (use i as the counter)

			
			// #6. Set the pen color to black

			
			// #7. move the robot by 50

			
			// #8. turn the robot to the right by 60
			
			
			// #12. set the pen color to blue for even numbers of i

			
			// #13. set the pen color to red for all odd numbers of i
			
			
			// #9. Use a for loop to do everything (#10, #11) 6 times ( use j as a counter )
			
			
					// #10. turn the robot to the left by 60
		
					
					// #11. move the robot by 50 (play the start button)
					
				
			
			// #14. set the pen color to black
				
		
	}

}
