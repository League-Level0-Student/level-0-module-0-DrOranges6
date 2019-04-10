import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class Checkpoint {


public static void main(String[] args) {
	
	
	String color = JOptionPane.showInputDialog("What is your favorite Color?");
	JOptionPane.showMessageDialog(null, color+" is my favorite color too!");
	
	Robot wally = new Robot();
	wally.penDown();
	wally.setSpeed(100);
	wally.turn(-90);
	wally.move(100);
	wally.turn(120);
	wally.move(200);
	wally.turn(120);
	wally.move(200);
	wally.turn(120);
	wally.move(100);
	
	
}

	
}

