package prime_no;

public class Prime_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		boolean flag=true;
		{
			for(int i=2; i<n; i++)
			{
				if(n%i==0)
				{
					flag=false;
				}
				}
				if(flag==true)
				{
					System.out.println(n+" is a prime number");
				}
				else
				{
					System.out.println(n+ " is not a prime number");
				}
			}
		}
	
}
