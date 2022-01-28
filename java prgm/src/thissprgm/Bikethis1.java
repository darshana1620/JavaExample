package thissprgm;

public class Bikethis1 {
	String name;
	String brand;
	int cc;
	Bikethis1(String name, String brand,int cc)
	 {
		 this.name=name;
		 this.brand=brand;
		 this.cc=cc;
		 
		 System.out.println(this.name);
		 System.out.println(this.brand);
		 System.out.println(this.cc);
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bikethis1 b1=new Bikethis1("duke","ktm",390);
		Bikethis1 b2=new Bikethis1("pulsar","bajaj",290);
				

	}

}
