package Temperature;

import java.util.*;

/*
 * In this exercise, you have to analyze records of temperature to find the closest to zero.
 * Write a program that prints the temperature closest to 0 among input data
 * 
 * INPUT:
 * Line 1: N, the number of temperatures to analyze
 * Line 2: The N temperatures expressed as integers ranging from -273 to 5526
 * 
 * OUTPUT:
 * Display 0 (zero) if no temperature is provided
 * Otherwise, display the temperature closest to 0, knowing that if two numbers are equally close to zero, 
 * positive integer has to be considered closest to zero (for instance, if the temperatures are -5 to 5, then display 5)
 * 
 * CONSTRAINTS:
 * 0 ≤ N < 10000
 * 
 * @author AshishSharmaji
 * @version 1.0 Build 25.04.2020
 *
 */


public class TemperatureCloseToZero {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt(); // the number of temperatures to analyse

		if(n<=0) {
			System.out.println(n);
			in.close();
		}
		else
		{
			int max = Integer.MAX_VALUE;
			Integer closest = null;
			for (int i = 0; i < n; i++) 
			{
				int t = in.nextInt();
				int current = Math.abs(t);
				if(t < 0)
				{
					if(current < max)
					{
						max = current;
						closest = t;
					}
				}
				if(t > 0)
				{
					if(current <= max)
					{
						max = current;
						closest = t;
					}
				}
			}
			System.out.println(closest);
		}
	}
}
