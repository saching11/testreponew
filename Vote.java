package voting;

import java.util.Scanner;

public class Vote {

	public static void main( String args[] ) {
		Scanner sc = new Scanner( System.in );
		int age;
		System.out.println("Enter your age");
		age = sc.nextInt();
		if(age >= 18) {
			System.out.println("You are allowed to vote");
		} else{
			System.out.println("You are not allowed to vote");
		}
	}
}
