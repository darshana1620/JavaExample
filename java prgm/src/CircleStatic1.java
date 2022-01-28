class Circle 
{
	void area()
	{
		final double pi=3.142;;
		int r=7;
		double res=pi*r*r;
		System.out.println(res);
	}
}
class CircleStatic1
{
	public static void main(String[] args) {	
	Circle a=new Circle();
	a.area();

	}

}
