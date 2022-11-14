package dailytasks;

import java.util.Scanner;

public class InnerClass {

	class outer{
		public void saa() {

		
			 System.out.println("enter the eletricity unit");
				Scanner sc = new Scanner(System.in);
				int d = sc.nextInt();
			if (d <=100) {
				System.out.println("no eletricity bill");	
		}else if (d>=100 && d<=300) {
			System.out.println("ur eleyricity bill is :"+d*2);
			
		}else if (d>=301 && d<=500) {
			System.out.println("ur eleyricity bill is :"+d*3);
			
		}else if (d>=501 && d<=800) {
			System.out.println("ur eleyricity bill is :"+d*4);
		}else {
			System.out.println("high unit");
		}
		}
	}
}
