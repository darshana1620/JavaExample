import java.util.Scanner;

public class LearningCustomizedException {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter age");
	
	int age=sc.nextInt();
	try {
		if(age<=21)
		{
			throw new UnderAgeException("age is underage");
		}
		else {
			System.out.println("show profiles");
		}
	}
	catch(UnderAgeException u) {
		System.out.println("exception occured but it is handled "+u.getMessage());
	}
	}
}
class UnderAgeException extends Exception
{
	String ErrorMessage;
	public UnderAgeException(String ErrorMessage) {
		// TODO Auto-generated constructor stub
	
	this.ErrorMessage=ErrorMessage;
	}

public String getMessage()
{
	return ErrorMessage;
	
}
}

