import java.util.*;
class Arrayaddmethod {
	 
	 public static int sum(int a[])
	 {
		 int sum=0;
		 for(int i=0;i<a.length;i++)
		 {
			 sum=sum+a[i];
		 }
		 return sum;
		 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a[]=new int[3];
		System.out.println("Enter the 3 value:");
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		int add=sum(a);
		System.out.println(add);
		}
		
				
	}

