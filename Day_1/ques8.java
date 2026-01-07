import java.util.Scanner;
public class ques8 {
	public static void main (String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the total number of series numbers you want to display:(>2) ");
		int n=sc.nextInt();
		int a=0,b=1,c;
		System.out.print("0 1 ");
		for (int i=1; i<=n-2; i++) {
			c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
		}
		System.out.print("\n"); 
	}
}
