class SuperKeyword 
{
    	String color = "White";
	public static void main(String args[]) 
	{
        Animal A = new Animal();
        A.Print(); 
	}
}

class Animal extends SuperKeyword 
{
    	String color = "Black";
    
	void Print() 
	{
        System.out.println("Color is ::" + color);
        System.out.println("Color is ::" + super.color);
    }
}


    

	