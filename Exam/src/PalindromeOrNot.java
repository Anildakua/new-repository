import java.util.Scanner;

public class PalindromeOrNot {

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner (System.in);
		System.out.println("Enter number");
		int a = scanner.nextInt();
		int b = a;
		int c = 0;
		
		while (a != 0)
		{
			int d = a % 10;
			c = c * 10 + d;
			a /= 10;
		}
		
		if (b==c)
		 {
			 System.out.println("It is palindrome");
		 }
		else
		{
			System.out.println("It is not palindrome");
		}
		scanner.close();
	}

}
