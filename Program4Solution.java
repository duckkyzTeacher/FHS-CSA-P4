//Program 4
/*
Program Description:
Assign 4 three-digit number to four different variables.
Then have the computer sum them and store the sum in a fifth variable.
Compute the average and store the answer in a sixth variable.
Print out the results.
Use the numbers 475, 821, 369, and 562 for your test data.
Notice the extra space between the word “IS” and the number “2227” and the blank line between the two lines of output.
Requirements:
Read user input data
Store input data in 4 separate variables
Store sum in a separate variable
Store average in a separate variable
Output average with decimal places
Can be more than 2
Sample Output:
The sum of the four numbers is 2227

The average of the four numbers is 556.75
 */

import java.util.Scanner; //This imports the console scanner that reads user input
//Your code here:
public class Program4Solution{
    public static void main(String[] args){
        //Declare Variables
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int num4 = 0;
        int numSum = 0;
        double numAvg = 0.0;

        //Create my scanner
        Scanner intScanner = new Scanner(System.in);

        //Ask for user input
        System.out.println("Enter the first 3 digit number: ");
        num1 = intScanner.nextInt();

        System.out.println("Enter the second 3 digit number: ");
        num2 = intScanner.nextInt();

        System.out.println("Enter the third 3 digit number: ");
        num3 = intScanner.nextInt();

        System.out.println("Enter the fourth 3 digit number: ");
        num4 = intScanner.nextInt();

        //Calc
        numSum = num1 + num2 + num3 + num4;
        numAvg = numSum/4.0; //Could also do [(double) numSum/4;]
        //Get rid of decimals
        numAvg = (numAvg*100)+0.5;          // shift decimal 2 places, add 0.5 to see if we needed to round
        numAvg = (int)numAvg;               // cast to int to remove other decimal places, auto cast back to double on assignment
        numAvg = numAvg/100;                // divide by 100 to shift back 2 decimal places
        //Print results
        System.out.println("The sum is: " + numSum);
        System.out.println("The average is: " + numAvg);
    }
}

//Paste console output below:
/*
Enter the first 3 digit number: 
475
Enter the second 3 digit number: 
821
Enter the third 3 digit number: 
369
Enter the fourth 3 digit number: 
562
556.75
The sum is: 2227
The average is: 556.75
 */
