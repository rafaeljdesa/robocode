package ultron;
import robocode.*;
import java.awt.Color;

// API help : http://robocode.sourceforge.net/docs/robocode/robocode/Robot.html

/**
 * Ultron - a robot by (Rafael de Sá)
 */
public class Ultron extends AdvancedRobot
{
	/**
	 * run: Ultron's default behavior
	 */
	public void run() {
		// Initialization of the robot should be put here

		// After trying out your robot, try uncommenting the import at the top,
		// and the next line:

		setColors(Color.darkGray,Color.black,Color.red); // body,gun,radar
		setBulletColor(Color.red);

		// Robot main loop
		while(true) {
			// Replace the next 4 lines with any behavior you would like
			ahead(80);
			back(80);
			turnGunRight(360);
		}
	}

	/**
	 * onScannedRobot: What to do when you see another robot
	 */
	public void onScannedRobot(ScannedRobotEvent e) {
		// Replace the next line with any behavior you would like
		for(int i=0; i<3; i++){
			fire(3);	
		}		
	}

	/**
	 * onHitByBullet: What to do when you're hit by a bullet
	 */
	public void onHitByBullet(HitByBulletEvent e) {
		// Replace the next line with any behavior you would like
		setBack(80);
		setTurnRight(90);
		execute();
	}
	
	/**
	 * onHitWall: What to do when you hit a wall
	 */
	public void onHitWall(HitWallEvent e) {
		// Replace the next line with any behavior you would like
		back(50);
		setBack(80);
		setTurnRight(90);
		execute();
	}	
}
