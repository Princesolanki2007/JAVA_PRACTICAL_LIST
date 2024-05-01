import java.io.*;
class practical3{
	public static void main(String[] args)
	{
		int a = 5;
		int b = 0;
		try {
			System.out.println(a / b); // throw Exception
		}
		catch (ArithmeticException e) {
			// Exception handler
			System.out.println(
				"Divided by zero operation cannot possible");
		}
	}
}
