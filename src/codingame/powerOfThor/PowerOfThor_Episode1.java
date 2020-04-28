package powerOfThor;

import java.util.*;
import java.io.*;
import java.math.*;

/*
 * Write a program that first read the initialization data from the standard input, then, in an infinite loop, 
 * provides on the standard output the instructions to move Thor.
 * 
 * INPUT:
 * Line 1: 4 integers 'lightX' 'lightY' 'initialTX' 'initialTY'. 
 * (lightX, lightY) indicates the position of the light. (initialTX, initialTY) indicates the initial position of Thor.
 * Line 2: the number of remaining moves for Thor to reach the light of power: 'remainingTurns'.
 * You can ignore this data but you must read it.
 * 
 * OUTPUT:
 * A single line providing the move to be made: N NE E SE S SW W ou NW.
 * 
 * CONSTRAINTS
 * 0 ≤ lightX < 40
 * 0 ≤ lightY < 18
 * 0 ≤ initialTX < 40
 * 0 ≤ initialTY < 18
 */

@SuppressWarnings("unused")
public class PowerOfThor_Episode1 {

	public static void main(String args[]) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int lightX = in.nextInt(); // the X position of the light of power
		int lightY = in.nextInt(); // the Y position of the light of power
		int initialTx = in.nextInt(); // Thor's starting X position
		int initialTy = in.nextInt(); // Thor's starting Y position

		// game loop
		while (true) {
			int remainingTurns = in.nextInt(); // The remaining amount of turns Thor can move. Do not remove this line.

			String directionY = "";
			String directionX = "";

			if(lightX > initialTx)
			{
				directionX = "E"; 
				initialTx=initialTx+1;
			}
			else if(lightX < initialTx)
			{
				directionX = "W";
				initialTx=initialTx-1;
			}

			if(lightY > initialTy)
			{
				directionY = "S";
				initialTy=initialTy+1;
			}
			else if(lightY < initialTy)
			{
				directionY = "N";
				initialTy=initialTy-1;
			}
			// A single line providing the move to be made: N NE E SE S SW W or NW
			System.out.println(directionY+directionX);
		}
	}
}
