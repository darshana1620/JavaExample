import java.util.*;
public class add2 {
	public static int sum(int a,int b)
	{
		int c=a+b;
		return c;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 2 no:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int sum=sum(a,b);
				System.out.println("the sum is:"+sum);
		


	}

}
