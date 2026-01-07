import java.util.Scanner;
public class ques6 {
	public static void main (String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a positive integer: ");
		int n=sc.nextInt();
		if (n==2)	{
			System.out.println("The number is prime:)");
			return;
		}
		for (int i=2; i<n/2; i++) {
			if (n%i==0)	{
				System.out.println("The number is not prime!!!");
				return;
			}
		}
		System.out.println("The number is prime:)");
	}
}
