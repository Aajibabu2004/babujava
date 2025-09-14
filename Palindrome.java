import java.util.Scanner;

public class Palindrome {
	
	public static boolean palindromeCheck(int n) {
		int temp = n;
		int rev_num = 0;
		
		while(temp > 0) {
			int last_digit = temp % 10;
			rev_num = (rev_num*10) + last_digit;
			temp /= 10; 
		}
		
		if(n == rev_num) {
			return true;
		}else {
			return false;
		}
		
	}
	
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter A Number : ");
		int n = s.nextInt();
		
		String t = Integer.toString(n);
		
		
	    if(palindromeCheck(n)) {
			System.out.println("Given Number is Palindrome");
		}else {
			System.out.println("Given Number is Not Palindrome");
		}
			
	}
}
