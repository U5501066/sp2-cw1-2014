import java.util.Scanner;
/**
 * CourseWorkOne here.
 *
 * @author Adriano - u5501066
 * @version 06/10/2014
 */
public class CourseworkOne
{
    static final int size=100;
   public static void main(String []args)
   {
	  int[] array1 = new int[size]; //Create array 1
      int[] array2 = new int[size]; //Create array 2
      System.out.print("Enter values of Array 1(0 to finish) ");
       array1 = fillArray();
       System.out.print("Enter values of Array 2(0 to finish) ");
       array2 = fillArray();
       if(array1[0]==0 )
       {
		    System.out.println("Array is empty");
		   System.exit(0);
	   }
	   if(array2[0]==0 )
	          {
	   		    System.out.println("Array is empty");
	   		   System.exit(0);
	   }
       System.out.print("Values of Array 1 is: ");
       displayElements(array1);
       System.out.println();
       System.out.print("Values of Array 2 is: ");
       displayElements(array2);
       System.out.println();
       System.out.print("Common data is:  ");
       displayCommon(array1,array2);
   }
public static int[] fillArray()
{
	  Scanner in = new Scanner(System.in);
      int[] array = new int[100];
      for(int i = 0; i < size; i++)
      {
		 System.out.print("Enter values: ");
         array[i] = in.nextInt();
         if(array[i] == 0)
         {
			 break;
		 }
      }
      return array;
 }
 public static void displayElements (int[] array)
 {
	 for (int i = 0; i < size; i++)
	 	{
	 		int matching = 0;
	 		for (int j = 0; (j < i) && (matching == 0); j++)
	 		if (array[i] == array[j])
	 		matching = 1;
	 		if (matching == 0 && array[i] !=0)
	 		System.out.print(array[i] + " ");
	}
 }
 public static void displayCommon(int[] a, int[] b)
 {
	 int count=0;
	for(int i = 0; i <size; i++)
	{
		for(int j=0; j<size;j++)
		{
			if(a[i] == b[j])
			{
				if(a[i] !=0)
				{
					count++;
				System.out.print(a[i] + " ");
				break;
			}
			}

		}
	}
	System.out.println();
       System.out.print("Number of common data is:  " + count);
       System.out.println();
       System.out.print("Noncommon data in array1:  ");
       for (int i = 0; i < size; i++)
	   	 	{
	   	 		int matching = 0;
	   	 		for (int j = 0; (j < size) && (matching == 0); j++)
	   	 		if (a[i] == b[j])
	   	 		matching = 1;
	   	 		if (matching == 0 && a[i] !=0)
	   	 		System.out.print(a[i] + " ");
	}
	System.out.println();
	       System.out.print("Noncommon data in array2:  ");
	       for (int i = 0; i < size; i++)
		   	 	{
		   	 		int matching = 0;
		   	 		for (int j = 0; (j < size) && (matching == 0); j++)
		   	 		if (b[i] == a[j])
		   	 		matching = 1;
		   	 		if (matching == 0 && b[i] !=0)
		   	 		System.out.print(b[i] + " ");
	}
 }
}
