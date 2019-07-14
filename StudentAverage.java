/* Raymundo Quinones
 * CIS 144 RT Summer
 * Extra Credit
 * Date 7/10/2019
 */

/* For this assignment I this a two dimensional ArrayList so a user can add multiple students and multiple test Scores.
 * I also did some exception handling to make sure the user inputs what is expected. The final print of this program  
 * prints the two dimensional ArrayList in a tabulated table with the average and the points to the student.
 */
import java.util.*;

public class StudentAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner input = new Scanner(System.in);
	List<List<Double>> students = new ArrayList<List<Double>>();
	Double test = -2.0;
	int student = 1;
	System.out.println("Welcome to Studetn Average application");
	do
	{
		System.out.println("Enter student's test scores:");
		List<Double> tests = new ArrayList<Double>();
		test = getUserInput();
		while(test != -1)
		{
			tests.add(test);
			System.out.println("Enter next test score or -1 to stop:");
			test = getUserInput();
			
		}
		students.add(tests);
		System.out.println("To enter another student test scores enter: 1 \nTo stop enter: -1");
		do
		{
			try
			{
				student = input.nextInt();
			}
			catch(InputMismatchException e)
			{
				System.out.println("\nInvalid Input");
				input.next();
			}
			if(student==0 || student<-1 || student>1)
			{
				System.out.println("Input must be 1 or -1");
			}
		}
		while(student!=0 && student<-1 || student>1);
	}
	while(student == 1);
	
	for(int i=0;i<students.size();i++)
	{
		System.out.printf("Student: %d Test Scores: Test Average: Points:\n",i+1);
		System.out.printf("%20.0f%10.2f%10d%n", students.get(i).get(0),getAverage(students.get(i)),qualityPoints(getAverage(students.get(i))));
		for(int u=1;u<students.get(i).size();u++)
		{
			System.out.printf("%20.0f%n",students.get(i).get(u));
		}
		System.out.printf("\n");
	}
	

	}
	public static double getAverage(List<Double> test)
	{
		int count = 0;
		int total = 0;
		for (int i=0; i<test.size();i++)
		{
			count++;
			total += test.get(i);
		}
		return (double)total/count;
	}
	public static int qualityPoints(double average)
	{
		if(average>90.0)
		{
			return 4;
		}
		else if(average>79.99 && average<90)
		{
			return 3;
		}
		else if(average>69.99 && average<80)
		{
			return 2;
		}
		else if(average>59.99 && average<70)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static double getUserInput()
	{
		Scanner input = new Scanner(System.in);
		double number = -1.0;
		while(number<0 || number>100)
		{
			try
			{
				number = input.nextDouble();
				if(number>0 && number<=100 || number == -1)
				{
					break;
				}
			}
			catch(InputMismatchException e)
			{
				System.out.println("\nInvalid Input!");
				input.next();
			}
			if(number<0 || number>100)
			{
				System.out.println("Test Score must be >0 and <100\nEnter new Score (or -1 to stop):");
			}
			
		}
		input.close();
		return number;
	}

}
