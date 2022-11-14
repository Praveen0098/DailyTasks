package dailytasks;

public class Palindrome {

	public static void main(String[] args) {
		
		
		int num = 76867;
		int res = 0, rem;
		int temp =num;
		
		while(num!=0) {
			rem = num%10;
			res = (res*10)+rem;
			num = num/10;
			
		}
		if (res == temp) {
			System.out.println("palindrome ");
			
		} else {
			System.out.println("not a palindrome");

		}
		
		}
}
