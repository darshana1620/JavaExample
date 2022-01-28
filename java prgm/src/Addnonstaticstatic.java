import java.util.*;
public class Addnonstaticstatic {
	int a;
	int b;
	int c;
	int sum=0;
	public void add(int a,int b, int c)
	{
		this.a=a;
		this.b=b;
		this.c=c;
		sum=a+b+c;
		System.out.println(sum);
	}
}
class Driver 
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addnonstaticstatic  a1=new Addnonstaticstatic();
		a1.a=10;
		a1.b=20;
		a1.c=30;
		
		System.out.println(a1.a);
		System.out.println(a1.b);
		System.out.println(a1.c);
		
		a1.add(20,30,50);
		
		Addnonstaticstatic  a2=new Addnonstaticstatic();
		System.out.println(a2.a);
		System.out.println(a2.b);
		System.out.println(a2.c);

	}

}
