package Sir_na_task;

import java.util.Scanner;

public class Division {
	

	public int Div() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first Number:");
		int a = sc.nextInt();
		System.out.println("Enter second Number:");
		int b = sc.nextInt();
		int  c = 0;
		if(b!=0) {
			c = a / b;
		return c;
		}else {
		   System.out.println("Not Divisable.");
		   return 0;
		}

		

    }
}