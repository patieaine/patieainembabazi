package assignment;
import java.util.Scanner;

public class Patience {

	
		public static void main(String[] args) {
			int i, q, z, c, b;
			int x=0;
			String[] name = new String[30];
			int[] age = new int[30];
			String[] course = new String[30];
			String[] year = new String[30];
			String[] section = new String[30];
			int menuChoice;
			Scanner input = new Scanner (System.in);
			start:
				do {
					System.out.println("\t\t\tStudent Record");
					System.out.println("\t\t1.Add Student\t");
					System.out.println("Enter a choice:");
					menuChoice = input.nextInt();
					if (menuChoice==1) {
						for (z=x; z<=29; z++) {
							System.out.println("Full name:");
							name [z] = input.next();
							System.out.println("Age:");
							age [z] = input.nextInt();
							System.out.println("Course:");
							course [z] = input.next();
							System.out.println("Year:");
							year [z] = input.next();
							System.out.println("Section:");
							section [z] = input.next();
							x++;
							continue start;
						}
					} else if (menuChoice==2) {
						for ( i=0; i<x; i++) {
							System.out.println(name[i] + age[i] + course[i] + year[i] + section[i]);
						}
					}
				} while (menuChoice<4);
				
		}

	}
	




