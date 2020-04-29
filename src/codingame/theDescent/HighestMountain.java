package theDescent;

import java.util.Scanner;

/*
 * In this exercise read the heights of the mountains from the standard input and print to the standard output the index of the mountain to shoot.
 * Write a program to Destroy the mountains before your starship collides with one of them. 
 * For that, shoot the highest mountain on your path.
 * 
 * INPUT:
 * 8 LINES: one integer 'mountainH' per line. Each represents the height of one mountain given in the order of their index (from 0 to 7).
 * 
 * OUTPUT:
 * A single line with one integer for the index of which mountain to shoot.
 * 
 * CONSTRAINS:
 * 0 ≤ mountainH ≤ 9
 * 
 * @author AshishSharmaji
 * @version 1.0 Build 29.04.2020
 * 
 */

public class HighestMountain {
	
	public static void main(String args[]) 
    {
        @SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);

        // game loop
        while(true){
        int max = 0; int ind=0;
            for (int i = 0; i <8; i++) 
            {
                int mountainH = in.nextInt(); 
                if (max<mountainH) 
                {
                    max=mountainH;
                    ind=i;
                }            
            }
            System.out.println(ind);
        }
    }
}
