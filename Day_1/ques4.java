import java.util.Scanner;
public class ques4 {
	public static void main(String args[])	 {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the radius: ");
		double rad=sc.nextDouble();
		double area=3.14*rad*rad;
		System.out.println("The area of the circle will be: "+area);
	}
}

