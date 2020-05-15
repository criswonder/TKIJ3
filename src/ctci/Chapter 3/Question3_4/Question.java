package Question3_4;

//3.4 In the classic problem of the Towers of Hanoi, you have 3 rods and N disks of different sizes which can slide
// onto any tower. The puzzle starts with disks sorted in ascending order of size from top to bottom (e.g., each
// disk sits on top of an even larger one). You have the following constraints:	(A) Only one disk can be
// moved at a time. (B) A disk is slid off the top of one rod onto the next rod. (C) A disk can only be
// placed on top of a larger disk. Write a program to move the disks from the first rod to the last using Stacks.
public class Question {
	public static void main(String[] args) {
		// Set up code.
		int n = 5;
		Tower[] towers = new Tower[3];
		for (int i = 0; i < 3; i++) {
			towers[i] = new Tower(i);
		}
		for (int i = n - 1; i >= 0; i--) {
			towers[0].add(i);
		}
		
		// Copy and paste output into a .XML file and open it with internet explorer.
		//towers[0].print();
		towers[0].moveDisks(n, towers[2], towers[1]);
		//towers[2].print();
	}
}
