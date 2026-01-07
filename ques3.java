import java.util.Scanner;
public class ques3	{
	public static void main (String args[])	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n1=sc.nextInt();
		System.out.print("Enter another number: ");
		int	n2=sc.nextInt();
		int add=n1+n2;
		System.out.println("The sum of the numbers is: "+add);
	}
}
