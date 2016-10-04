/*
	This program checks to see if any combination of (a) or (ab) is in a langauge S (input)
	Author: Patrick Flynn, 66414451
*/

import java.util.*;

public class languageS
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in); //import scanner

		System.out.println("Enter a string of combination a or ab: "); //ask user for a combination of a or ab 

		String input = sc.nextLine();

		//System.out.println(input);

		Boolean isS = false; //decalre and initialise isS boolean valuse

		
		String finalResult = input; 

		//create a for loop to cycle through input, checking whether the last or last two characters are either a or ab, 
		//if so add the string minus the 'matched' character to a new string variable called final result. 
		//When finalResult has no characters left, set its value to 'empty'.

		for(int i = input.length(); i > 0; i--) 
		{

			//this is an else if statement dealing with when finalResult is equal to 2 or 1, otherise we get an out of bounds runtime error as the loop
			//starts looking for invalid indexes of -1 or -2 in the string.
			if(finalResult.length() == 2 && finalResult.substring(0, 2).equals("ab")) 
			{								
				finalResult = "empty";		
			}
			else if (finalResult.length() == 1 && finalResult.substring(0, 1).equals("a")) {
				finalResult = "empty";	
			}
			else if (finalResult.length() == 1 && !finalResult.substring(0, 1).equals("a")) {
				break;	
			}


			//here is the main else if statement that runs through the input and edits finalResult minus either a or ab
			else if(finalResult.substring(finalResult.length()-1, finalResult.length()).equals("a"))
			{
				finalResult = finalResult.substring(0, finalResult.length()-1);				
			}
			else if(finalResult.substring(finalResult.length()-2, finalResult.length()).equals("ab"))
			{				
					finalResult = finalResult.substring(0, finalResult.length()-2);			
			}						
		} //end of for loop

		//finally we have an else if statement which sets the boolean variable isS to true if the String variable finalResult is equalled to
		//'empty'.

		if(finalResult.equals("empty"))
		{
			isS = true;
			System.out.println(isS);
		}
		else
		{
			System.out.println(isS);
		}
	} //end of main method
} //end of program