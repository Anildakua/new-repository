import java.util.Scanner;

public class DimondPattern {

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number");
		int a = scanner.nextInt();
		
		for (int i=1; i<=a; i++)
		{
			for (int j=i; j<=a; j++)
			{
				System.out.print(" ");
			}
			for (int j=1; j<=i; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for (int i=a-1; i>=1; i--)
		{
			for (int j=a; j>=i; j--)
			{
				System.out.print(" ");
			}
			for (int j=1; j<=i; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		scanner.close();
	}
}
//it is ok