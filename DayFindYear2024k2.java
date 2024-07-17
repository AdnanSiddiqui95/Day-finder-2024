import java.util.Scanner;
public class DayFindYear2024k2 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any month Of this year 2024  : ");
		int month=sc.nextInt();
		//int [] mon= {3,1,3,2,3,2,3,3,2,3,2};
		int [] mon= {0,3,4,7,9,12,14,17,20,22,25,27};
		if(month>=1 && month<=12)
		{
		System.out.println("Enter any Date Of 2024 : ");
		int date=sc.nextInt();
		if(date>=1 && date<=31)
		{
		String []arr= {"Sunday","Monday","Tuesday","Wednesday","Thrusday","friday","Saturday"};
			date=date+mon[month-1];
		System.out.println("Day: "+arr[date%7]);
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
