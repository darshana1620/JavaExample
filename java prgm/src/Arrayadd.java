import java.util.Scanner;

public class Arrayadd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
					Scanner sc=new Scanner(System.in);
					System.out.println("Enter the size of array");
					
					
					int size=sc.nextInt();
					int a[]=new int[size];
					int sum=0;
					
					System.out.println("Enter the value:");
					for(int i=0;i<a.length;i++)
					{
						a[i]=sc.nextInt();
					}
					for(int i=0;i<a.length;i++)
						{
							sum=sum+a[i];
						
						}
					System.out.println("the sum of the element are:"+sum);
					}
						}
					
	


