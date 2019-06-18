package arrays;

import java.util.Random;
import java.util.concurrent.ForkJoinTask;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
public static void main(String[] args) {
	

	//2. create an array of 5 robots.
Robot[] robots = new Robot[2];
	//3. use a for loop to initialize the robots.
for (int i = 0; i < robots.length; i++) {
	robots[i] = new Robot();
}
		//4. make each robot start at the bottom of the screen, side by side, facing up
robots[0].setSpeed(100);
robots[0].setY(350);
robots[0].setX(550);
robots[0].turn(90);
robots[0].penDown();
robots[0].move(200);
robots[0].penUp();
robots[0].turn(-90);

int space = 50;
for (int i = 0; i < robots.length; i++) {
	robots[i].setX(space);
	robots[i].setY(350);
	robots[i].setSpeed(10);
	space += 100;
}
	//5. use another for loop to iterate through the array and make each robot move 
	//   a random amount less than 50.
Random rand = new Random();
while (robots[0].getX() < 622 && robots[1].getX() < 722) {
	for (int i = 0; i < robots.length; i++) {
	for (int j = 0; j < rand.nextInt(10); j++) {
		
	
		robots[i].move(5);
		robots[i].turn(1);
		
	}
	
	}
}
	//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.

	//7. declare that robot the winner and throw it a party!
if(robots[0].getX() >= 622) {
	JOptionPane.showMessageDialog(null, "Bot 1 is the winner");
}
if(robots[1].getX() >= 722) {
	JOptionPane.showMessageDialog(null, "Bot 2 is the winner");
}

	//8. try different races with different amounts of robots.

	//9. make the robots race around a circular track.
}
}
