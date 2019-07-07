import java.util.*;

public class DuplicateElimination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = new int[3];
		int count = 0;
		int firstNumber = 0;
		int number = 0;
		boolean duplicate = false;
		
		do
		{
			System.out.println("Enter a number between 10-100: ");
			firstNumber = getInput();
		}
		while (!(firstNumber >= 10 && firstNumber <= 100));
		System.out.println("" + firstNumber);
		do 
		{
			System.out.println("Enter another number between 10-100: ");
			number = getInput();
		} 
		while (!(number >= 10 && number <= 100));
		
		while (count < 4) 
		{
			count++;
			duplicate = false;
			if (number != firstNumber) 
			{
				for (int i = 0; i < numbers.length; i++) 
				{
					if (number == numbers[i]) 
					{
						duplicate = true;
					}
				}
				if (duplicate == false) 
				{
					System.out.print(printArray(numbers));
					System.out.print(firstNumber + ", " + number + "\n");
					if (count < 4) 
					{
						numbers[count - 1] = number;
					}
				}
			}
			if (duplicate == true || number == firstNumber) 
			{
				System.out.println("Duplicate Number!");
			}
			if (count < 4) 
			{
				do 
				{
					System.out.println("Enter another number between 10-100: ");
					number = getInput();
				} while (!(number >= 10 && number <= 100));
			}
		}
		System.out.print("\nThe Numbers Enter are: " + firstNumber + ", ");
		System.out.print(printArray(numbers));
		
		if (duplicate == false) 
		{
			if (firstNumber != number) 
			{
				System.out.printf("%d", number);
			}
		}

	}
	public static int getInput()
	{
		Scanner input = new Scanner(System.in);
		int number = 0;
		try 
		{
			number = input.nextInt();
		} 
		catch (InputMismatchException e) 
		{
			// System.out.println(e);
			System.out.println("Invalid Input");
			input.next();
		}
		return number;
	}
	public static String printArray(int[] numbers)
	{
		String array = "";
		for (int i = 0; i < numbers.length; i++) 
		{
			if (numbers[i] != 0) 
			{
				array += numbers[i]+ ", ";
			}
		}
		return array;
		
	}

}
