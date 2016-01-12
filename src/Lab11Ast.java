// Lab11Ast.java
// The "Mean, Median and Mode" Program
// This is the student, starting version of Lab 11A.


import java.util.Arrays;
import java.util.Random;


public class Lab11Ast
{

	public static void main(String args[])
	{
		System.out.println("\nLab 11A\n");
		System.out.print("Enter the quantity of random numbers  ===>>  ");
		int listSize = Expo.enterInt();
		System.out.println();
		Statistics intList = new Statistics(listSize);
		intList.randomize();
		intList.computeMean();
		intList.computeMedian();
		intList.computeMode();
		intList.displayStats();
		System.out.println();
	}
}


class Statistics
{

	private int list[];			// the actual array of integers
	private int size;			// user-entered number of integers in the array
	private int mean;		// used for the  80, 100 and 110 point versions
	private double median;		// used for the 100 and 110 point versions
	private double mode;			// used for the 110 point version only

	public Statistics(int s)
	{
		size = s;
		list = new int[size];
	}

	public void randomize()
	{
		// This provided method creates the same exact list of "random" numbers for every execution.
		// You will learn more about this in Chapter 14.  For now just use the provided method.
		Random rand = new Random(12345);
		for (int k = 0; k < size; k++)
			list[k] = rand.nextInt(31) + 1;  // range of 1..31
	}

	public void computeMean()
	{
		for (int k = 0; k < size; k++)
			mean = mean + list[k];
			mean = mean / size;
			
	}

	public void computeMedian()
	{
		if (size % 2 == 0)
		{
			int q = size / 2;
			int w = q - 2;
			double e = list[q];
			double r = list[w];
			median = (e + r) / 2;
			
		}	
		else
		{
			int a= (size / 2);
			double s = list[a];
			median = s;
			
		}
	}

	public void computeMode()
	{
		// precondition: The list array has exactly 1 mode.


	}

	public void displayStats()
	{
		Arrays.sort(list);
		System.out.println(Arrays.toString(list));
		System.out.println();
		System.out.println("Mean:    " + mean);
		System.out.println("Median:  " + median);
		System.out.println("Mode:    " + mode);
	}

}

