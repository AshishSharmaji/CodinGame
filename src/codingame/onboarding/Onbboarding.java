package onboarding;

import java.util.Scanner;

/*
 * Write a program to destroy the enemy ships by shooting the closest enemy on each turn.
 * 
 * RULE:
 * On each start of turn (within the game loop), you obtain information on the two closest enemies:
 * 'enemy1' and 'dist1': the name and the distance to enemy 1.
 * 'enemy2' and 'dist2': the name and the distance to enemy 2.
 * 
 * Before your turn is over (end of the loop), output the value of either enemy1 or enemy2 to shoot the closest enemy.
 * 
 * @author AshishSharmaji
 * @version 1.0 Build 29.04.2020
 * 
 */

public class Onbboarding {

	public static void main(String args[]) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);

		// game loop
		while (true) {
			String enemy1 = in.next(); // name of enemy 1
			int dist1 = in.nextInt(); // distance to enemy 1
			String enemy2 = in.next(); // name of enemy 2
			int dist2 = in.nextInt(); // distance to enemy 2

			if (dist1 < dist2) {
				System.out.println(enemy1);
			} else {
				System.out.println(enemy2);
			}
		}
	}
}
