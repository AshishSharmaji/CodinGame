package MarsLander;

import java.util.*;
import java.io.*;
import java.math.*;

/*
 * The goal for your program is to safely land the "Mars Lander" shuttle, the landing ship which contains the Opportunity rover.
 * 
 * For a landing to be successful, the ship must:
 * Land on flat ground
 * Land in a vertical position (tilt angle = 0°)
 * Vertical speed must be limited ( ≤ 40m/s in absolute value)
 * Horizontal speed must be limited ( ≤ 20m/s in absolute value)
 * 
 * INPUT:
 * Line 1: The number 'surfaceN' of points used to draw the surface of Mars.
 * Next 'SurfaceN' Line: A couple of integers 'landX' 'landY' providing the coordinates of a ground point. By linking all the points together in a sequential fashion,
 * you form the surface of Mars which is composed of several segments. For the first point, 'landX' = 0 and for the last point, 'landX' = 6999
 * 
 * A single line with 7 integers: 'X' 'Y' 'hSpeed' 'vSpeed' 'fuel' 'rotate' 'power'
 * 'X','Y' are the coordinates of Mars Lander (in meters).
 * 'hSpeed' and 'vSpeed' are the horizontal and vertical speed of Mars Lander (in m/s). These can be negative depending on the direction of Mars Lander.
 * 'fuel' is the remaining quantity of fuel in liters. When there is no more fuel, the power of thrusters falls to zero.
 * 'rotate' is the angle of rotation of Mars Lander expressed in degrees.
 * 'power' is the thrust power of the landing ship.
 * 
 * OUTPUT:
 * A single line with 2 integers: 'rotate' 'power' :
 * 'rotate' is the desired rotation angle for Mars Lander. Please note that for each turn the actual value of the angle is limited to the value of the previous turn +/- 15°.
 * 'power' is the desired thrust power. 0 = off. 4 = maximum power. Please note that for each turn the value of the actual power is limited to the value of the previous turn +/- 1.
 * 
 * CONSTRAINTS:
 * 2 ≤ surfaceN < 30
 * 0 ≤ X < 7000
 * 0 ≤ Y < 3000
 * -500 < hSpeed, vSpeed < 500
 * 0 ≤ fuel ≤ 2000
 * -90 ≤ rotate ≤ 90
 * 0 ≤ power ≤ 4
 * Response time per turn ≤ 100ms
 * 
 * @author AshishSharmaji
 * @version 1.0 Build 28.04.2020
 */
public class MarsLander_Episode1 {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int surfaceN = in.nextInt(); // the number of points used to draw the surface of Mars.
		for (int i = 0; i < surfaceN; i++) {
			int landX = in.nextInt(); // X coordinate of a surface point. (0 to 6999)
			int landY = in.nextInt(); // Y coordinate of a surface point.
		}

		while (true) {
			int X = in.nextInt();
			int Y = in.nextInt();
			int hSpeed = in.nextInt(); // the horizontal speed (in m/s), can be negative.
			int vSpeed = in.nextInt(); // the vertical speed (in m/s), can be negative.
			int fuel = in.nextInt(); // the quantity of remaining fuel in liters.
			int rotate = in.nextInt(); // the rotation angle in degrees (-90 to 90).
			int power = in.nextInt(); // the thrust power (0 to 4).

			if (Math.abs(vSpeed) >= 40){
				System.out.println("0 4");
			}
			else
				System.out.println("0 0");            
		}
	}
}
