package assin3;
import java.util.Scanner;
public class fact_no {

	public static void main(String[] args) {
     Scanner sc=new Scanner (System.in);
     System.out.println("enter the no.");
     int n=sc.nextInt();
     System.out.println("the factorial of the no. is"+fact(n));
     
	}
	public static int fact(int n)
	{
		if(n==0||n==1)
			return 1;
		else
			return (n*fact(n-1));
	}

}
