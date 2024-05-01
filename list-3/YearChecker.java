import java.util.*;
class YearChecker 
{
	public boolean isLeapYear(int year) 
	{
    		if (year % 4 == 0) 
		{
      			if (year % 100 == 0) 
			{
        			if (year % 400 == 0) 
				{
          				return true;
        			}
				 else 
				{
          				return false;
        			}
      			} 
			else 
			{
        			return true;
      			}
		}
	 	else 
		{
      			return false;
    		}
  	}

	public static void main(String[] args) 
	{
	int year;

	Scanner sc = new Scanner(System.in);

	System.out.print("Enter The Year ::");
	year = sc.nextInt();

    	LeapYearChecker lyc = new LeapYearChecker();
    	lyc.checkLeapYear(year);
  	}

}

class LeapYearChecker extends YearChecker 
{
	  public void checkLeapYear(int year) 
	{
    		if (isLeapYear(year)) 
		{
      			System.out.println(year + " is a leap year.");
    		}
		 else 
		{
      			System.out.println(year + " is not a leap year.");
    		}
  	}
}



