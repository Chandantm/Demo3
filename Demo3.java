
public class Demo3
{

	public static void main(String[] args)
	{
		int a = 10;
		System.out.println("The value for a is : " + a);
		
		int b = 5;
		System.out.println("The value for b : " + b);
		
		System.out.println("-----------------------------------------");
		System.out.print("The Sum is : ");

		int c = a+b;
		System.out.print(c);
		System.out.println();

		
		System.out.print("The Difference is : ");

		int d = a-b;
		System.out.print(d);
		System.out.println();

		
		System.out.print("The Product is : ");

		int e = a*b;
		System.out.print(e);
		System.out.println();

		try 
		{
			System.out.print("The Remainder is : ");
			int f = a/b;
			System.out.print(f);
			System.out.println();

		}
		catch(Exception ex)
		{
			System.out.println("Enter non Zero Denominator");
		}
		

	}

}
