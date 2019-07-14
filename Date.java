/* Raymundo Quinones
 * CIS 144 RT Summer
 * Exercise 8.5 "Date Class"
 * Date 7/10/2019
 */

/* This class uses three constructors and uses different methods to fill out all instance variables. There is a validateDate
 * method that checks for an accurate date even in a leap year, but leap year got to complicated so there maybe some errors
 * when considering leap years. Test for this class will also be included to check all 3 toString method give accurate and
 * similar dates. 
 */
public class Date {
	private int month;
	private int day;
	private int year;
	private String monthName;
	private int dayofYear;
	
	public Date(int month, int day, int year)
	{
		if(month<1 || month>12 || year<0||validateDate(month,day,year)==false)
		{
			throw new IllegalArgumentException("Month must be 1-12: Year must be possitive: Date must be valid for the specific month and leap year");
		}
		this.month = month;
		this.day = day;
		this.year = year;
		this.monthName = getMonthName(month);
		this.dayofYear = getDayofYear(month,day);
	}
	
	public Date(String month,int day,int year)
	{
		String temp = month.toLowerCase();
		switch(temp) {
		case "january":
			this.monthName = month;
			this.month = 1;
			break;
		case "february":
			this.monthName = month;
			this.month = 2;
			break;
		case "march":
			this.monthName = month;
			this.month = 3;
			break;
		case "april":
			this.monthName = month;
			this.month = 4;
			break;
		case "may":
			this.monthName = month;
			this.month = 5;
			break;
		case "june":
			this.monthName = month;
			this.month = 6;
			break;
		case "july":
			this.monthName = month;
			this.month = 7;
			break;
		case "august":
			this.monthName = month;
			this.month = 8;
			break;
		case "september":
			this.monthName = month;
			this.month = 9;
			break;
		case "october":
			this.monthName = month;
			this.month = 10;
			break;
		case "november":
			this.monthName = month;
			this.month = 11;
			break;
		case "december":
			this.monthName = month;
			this.month = 12;
			break;
		default:
			temp = "Invalid";
		}
		if(this.monthName == null||year<0||validateDate(this.month,day,year)==false)
		{
			throw new IllegalArgumentException("Invalid Month, Day, or Year");
		}
		this.day = day;
		this.year = year;
		this.dayofYear = getDayofYear(this.month,day);
	}
	
	public Date(int dayofYear, int year)
	{
		if(dayofYear<0 || dayofYear>365 || year<0)
		{
			throw new IllegalArgumentException("Day of the year must be 0-365 and Year must be positive");
		}
		this.dayofYear = dayofYear;
		this.year = year;
		if(dayofYear-32<0)
		{
			this.month = 1;
			this.day = dayofYear;
		}
		else if(dayofYear-60<0)
		{
			this.month = 2;
			this.day = dayofYear - 31;
		}
		else if(dayofYear-91<0)
		{
			this.month = 3;
			this.day = dayofYear - 59;
		}
		else if(dayofYear-121<0)
		{
			this.month = 4;
			this.day = dayofYear - 90;
		}
		else if(dayofYear-152<0)
		{
			this.month = 5;
			this.day = dayofYear - 120;
		}
		else if(dayofYear-182<0)
		{
			this.month = 6;
			this.day = dayofYear - 151;
		}
		else if(dayofYear-213<0)
		{
			this.month = 7;
			this.day = dayofYear - 181;
		}
		else if(dayofYear-244<0)
		{
			this.month = 8;
			this.day = dayofYear - 212;
		}
		else if(dayofYear-274<0)
		{
			this.month = 9;
			this.day = dayofYear - 243;
		}
		else if(dayofYear-305<0)
		{
			this.month = 10;
			this.day = dayofYear - 273;
		}
		else if(dayofYear-335<0)
		{
			this.month = 11;
			this.day = dayofYear - 304;
		}
		else if(dayofYear-366<0)
		{
			this.month = 12;
			this.day = dayofYear - 334;
		}
		this.monthName = getMonthName(this.month);
	}
	
	public String toString()
	{
		return String.format("%d/%d/%d", this.month,this.day,this.year);
	}
	public String toStringAlt()
	{
		return String.format("%s %d %d", this.monthName,this.day,this.year);
	}
	public String toStringDayofYear()
	{
		return String.format("Date: %d Of Year: %d", this.dayofYear,this.year);
	}
	
	public static boolean validateDate(int month,int day,int year)
	{
		boolean validDate = false;
		if(month == 2 && year%4 != 0)
		{
			if(day>0 && day<=28)
			{
				validDate = true;
			}
		}
		else if(month == 2 && year%4 == 0 && year%100 !=0)
		{
			if(day>0 && day<=29)
			{
				validDate = true;
			}
		}
		else if(month == 2 && year%4 == 0 && year%100 ==0)
		{
			if(year%400 == 0)
			{
				if(day>0 && day<=29)
				{
					validDate = true;
				}
			}
			else
			{
				if(day>0 && day<=28)
				{
					validDate = true;
				}
			}
		}
		else if(month>0 && month<8 && month%2 != 0)
		{
			if(day>0 && day <= 31)
			{
				validDate = true;
			}
		}
		else if(month>0 && month<8 && month%2 == 0)
		{
			if(day>0 && day <=30)
			{
				validDate = true;
			}
		}
		else if(month>7 && month<=12 && month%2 != 0)
		{
			if(day>0 && day <=30)
			{
				validDate = true;
			}
		}
		else if(month>7 && month<=12 && month%2 == 0)
		{
			if(day>0 && day <= 31)
			{
				validDate = true;
			}
		}
		return validDate;
	}
	public static String getMonthName(int month)
	{
		String monthName = "";
		switch(month) {
		case 1:
			monthName = "January";
			break;
		case 2:
			monthName = "February";
			break;
		case 3:
			monthName = "March";
			break;
		case 4:
			monthName = "April";
			break;
		case 5:
			monthName = "May";
			break;
		case 6:
			monthName = "June";
			break;
		case 7:
			monthName = "July";
			break;
		case 8:
			monthName = "August";
			break;
		case 9:
			monthName = "September";
			break;
		case 10:
			monthName = "October";
			break;
		case 11:
			monthName = "November";
			break;
		case 12:
			monthName = "December";
			break;
		}
		return monthName;
	}
	
	public static int getDayofYear(int month, int day)
	{
		int dayofYear = 0;
		if(month == 1)
		{
			dayofYear = day;
		}
		else if(month==12)
		{
			dayofYear = 365-(31-day);
		}
		else if (month>1 && month<12)
		{
			int months = month-1;
			int months31 =0;
			int months30 =0;
			if(months <=7)
			{
				for(int i=1;i<=months;i+=2)
				{
					months31++;
				}
				months30 = months-months31-1;
			}
			else
			{
				for(int i=1;i<=7;i+=2)
				{
					months31++;
				}
				for(int i=8;i<=months;i+=2)
				{
					months31++;
				}
				months30 = months-months31-1;
			}
			dayofYear = months31*31 + months30*30 + 28+day;
		}
		return dayofYear;
	}
	

}
