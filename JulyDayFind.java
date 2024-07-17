import java.util.Scanner;
public class JulyDayFind 
{
	public static void main(String[] args)
	{
		System.out.println("Enter any Date Of JULY 2024 : ");
		
		Scanner sc=new Scanner(System.in);
		int date=sc.nextInt();
		if(date>=1 && date<=31)
		{
		String []arr= {"Sunday","Monday","Tuesday","Wednesday","Thrusday","friday","Saturday"};
		System.out.println(arr[date%7]);
		}
		else
		{
			System.out.println("Invalid date");
		}
	}

}
