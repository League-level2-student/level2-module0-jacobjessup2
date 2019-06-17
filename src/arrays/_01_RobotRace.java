package arrays;

import java.util.Random;
import java.util.concurrent.ForkJoinTask;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
public static void main(String[] args) {
	

	//2. create an array of 5 robots.
Robot[] robots = new Robot[5];
	//3. use a for loop to initialize the robots.
for (int i = 0; i < robots.length; i++) {
	robots[i] = new Robot();
}
		//4. make each robot start at the bottom of the screen, side by side, facing up
robots[0].setX(250);
robots[0].setY(550);
robots[0].setSpeed(10);

robots[1].setX(350);
robots[1].setY(550);
robots[1].setSpeed(10);

robots[2].setX(450);
robots[2].setY(550);
robots[2].setSpeed(10);

robots[3].setX(550);
robots[3].setY(550);
robots[3].setSpeed(10);

robots[4].setX(650);
robots[4].setY(550);
robots[4].setSpeed(10);
	//5. use another for loop to iterate through the array and make each robot move 
	//   a random amount less than 50.
Random rand = new Random();
while (robots[0].getY() > 0 && robots[1].getY() > 0 && robots[2].getY() > 0 && robots[3].getY() > 0 && robots[4].getY() > 0) {
	for (int i = 0; i < robots.length; i++) {
	robots[i].move(rand.nextInt(50));
	}
}
	//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.

	//7. declare that robot the winner and throw it a party!
if(robots[0].getY()<0) {
	JOptionPane.showMessageDialog(null, "Bot 1 is the winner");
}

else if(robots[1].getY()<0) {
	JOptionPane.showMessageDialog(null, "Bot 2 is the winner");
}

else if(robots[2].getY()<0) {
	JOptionPane.showMessageDialog(null, "Bot 3 is the winner");
}

else if(robots[3].getY()<0) {
	JOptionPane.showMessageDialog(null, "Bot 4 is the winner");
}

else if(robots[4].getY()<0) {
	JOptionPane.showMessageDialog(null, "Bot 5 is the winner");
}


	//8. try different races with different amounts of robots.

	//9. make the robots race around a circular track.
}
}
