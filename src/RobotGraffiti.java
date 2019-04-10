import org.jointheleague.graphical.robot.Robot;

public class RobotGraffiti {
public static void main(String[] args) {
	
	Robot Wally = new Robot();
	Wally.hide();	
	Wally.penDown();
	Wally.setSpeed(300);
	Wally.turn(-90);
for (int i=0; i <180; i++) {
	
	Wally.move(1);
	Wally.turn(1);
}

}
}

