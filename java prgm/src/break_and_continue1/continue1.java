package break_and_continue1;

public class continue1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		while(i<=10)
		{
			if(i==5)
			{
				i=i+1;
				System.out.println("missing");
				continue;
			}
			System.out.println(i);
			i=i+1;
		}

	}

}
