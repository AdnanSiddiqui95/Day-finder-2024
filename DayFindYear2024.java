import java.util.Scanner;
public class DayFindYear2024 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any month Of this year 2024  : ");
		int month=sc.nextInt();
		int [] mon= {31,29,31,30,31,30,31,31,30,31,30};
		if(month>=1 && month<=12)
		{
		System.out.println("Enter any Date Of 2024 : ");
		int date=sc.nextInt();
		if(date>=1 && date<=31)
		{
		String []arr= {"Sunday","Monday","Tuesday","Wednesday","Thrusday","friday","Saturday"};
		for(int i=0;i<month-1;i++)
		{
			date=date+mon[i];
		}
		System.out.println(arr[date%7]);
		}
		else
		{
			System.out.println("Invalid date");
		}
		}
		else
		{
			System.out.println("Invalid month");
		}
	}

}
