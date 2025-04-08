import java.util.Scanner;

public class SumOfArray {

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner (System.in);
		
		int[] number = new int[5];
		int sum = 0;
		int i = 0;
		
		System.out.println("Enter 5 numbers");
		
		while (i < 5)
		{
			number[i] = scanner.nextInt();
			sum += number[i];
			i++;
		}
		System.out.println("Sum of all array numbers: "+sum);
		scanner.close();
	}
}
