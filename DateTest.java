
public class DateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Date date1 = new Date(1,16,1988);
	Date date2 = new Date("October",27,2017);
	Date date3 = new Date(123,2015);
	
	System.out.println(date1.toString());
	System.out.println(date1.toStringAlt());
	System.out.println(date1.toStringDayofYear()+"\n");
	
	System.out.println(date2.toString());
	System.out.println(date2.toStringAlt());
	System.out.println(date2.toStringDayofYear()+"\n");
	
	System.out.println(date3.toString());
	System.out.println(date3.toStringAlt());
	System.out.println(date3.toStringDayofYear()+"\n");

	}

}
