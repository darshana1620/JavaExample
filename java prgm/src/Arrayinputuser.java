import java.util.*;
public class Arrayinputuser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		
		int size=sc.nextInt();
		int a[]=new int[size];
		
		System.out.println("Enter the value");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("the elements are");
		for(int i=0;i<a.length;i++)
		{
		System.out.println(a[i]);
		
		}
	}
}

