/*
 * Weekly Challenge Nov 11

Pattern 1

*
**
***
****
*****

Pattern 2

    *
   ***
  *****
 *******
*********
    *
   ***
  *****
 *******
*********

Pattern 3

   *
  *A*
 *A*A*
*A*A*A*

*/


public class WeeklyChallenge_Nov_11 {
	
	public static void main (String[]args) {
		
		
		//Pattern 1
		
		System.out.println("Pattern 1:\n");
		int levels1 = 5;

		
		for (int i = 1; i <= levels1; i++) {
			
			for (int j = 0; j < i; j++) {
				
				System.out.print("*");
				
			}
			System.out.println();
			
		}
		
		//Pattern 2
		System.out.println("\nPattern 2:\n");
		int levels2 = 5;

		
		for (int i = 1; i <= levels2; i++) {
			
			for (int j = levels2-i; j > 0; j--) {
				
				System.out.print(" ");
				
			}
			
			for (int j = 0; j < i*2-1; j++) {
				
				System.out.print("*");
			}
			
			System.out.println();
			
		}
		
		//Pattern 3
		
		int levels3 = 4;
		
		System.out.println("\nPattern 3:\n");
		
		for (int i = 1; i <= levels3; i++) {
			
			for (int j = levels3-i; j > 0; j--) {
				
				System.out.print(" ");
				
			}
			
			for (int j = 0; j < i*2-1; j++) {
				
				if (j % 2 == 0) {
					System.out.print("*");
				}
				else {
					System.out.print("A");

				}
				
			}
			
			
			System.out.println();
			
		}
		
	}
}
