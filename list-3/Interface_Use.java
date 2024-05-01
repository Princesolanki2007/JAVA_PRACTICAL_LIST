//Write a program of interface implementation.
interface A
{
	public void showa();
}
interface B
{
	public void showb();
}

class C implements A,B
{
	public void showa()
	{
		System.out.println("Interface A Method");
	}
	
	public void showb()
	{
		System.out.println("Interface B Method");
	}

	C()
	{
		System.out.println("Class C Method");
	}
}

class Interface_Use
{
	public static void main(String args[])
	{
		C c = new C();
		c.showa();
		c.showb();
	}
}