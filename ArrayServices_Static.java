//authored by Andrew Urban
//Environtment: NetBeans IDE 5.5
//Dr. Istvan Molnar, Programming II
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
//Services class for Advanced Array functions.
public class ArrayServices_Static 
{
    static Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) 
    {
        
    }
    
    public static int maximumsearch(int[]My_array) 
    {
        int Max = My_array[0];
        
        for (int index = 0; index < My_array.length;index++)
            if(Max < My_array[index])
                Max = My_array[index];
        return Max;
    }
    
    public static int minimumsearch(int[]My_array) 
    {
        int Min= My_array[0];
        
        for (int index = 0; index < My_array.length; index++)
            if (Min > My_array[index])
                Min = My_array[index];
        return Min;
    }
    
    public static void  swap(int a, int b) 
    {
        int temp1,temp2;
        temp1 = a;
        temp2 = b;
        a = temp2;
        b = temp1;
    
    }
    // method using a boolean expression to return wether or not the specified variable is present in the array.
    public static boolean variablePresent(int[]My_array, int Variable) 
    {
        boolean found = false; 
        for (int index = 0; index < My_array.length; index++)
            if(Variable == My_array[index])  //checks the array values against the variable passed
                found = true;
        
        return found;
    }
    
    public static int count(int[]My_array) 
    {
        int count = 0;
        for (int index = 0; index < My_array.length; index++)
            count = (count + 1);  //alternative instead of simply using My_array.length for count, used to define a working counter.
        return count;
    }
    //a method used to determine and return the sum value based on the array passed.
     public static int sum(int[]My_array)
    {
        int sum = 0;
       for (int index = 0; index < My_array.length; index++)
         sum = (sum + My_array[index]); // adds the value of sum back onto itself everytime the for loop executes, while there are values left unchecked in the array.
        
        return sum;
    }
    // a method to compute and return the average of the values of an array, based on the sum and count of the array passed to the sum and count methods.
     public static float average(int My_sum, int My_count) 
    {
        float average= 0;
         average = My_sum / My_count;
             return average;
    }
     //a method designed to sort the array into order from minimum to maximum value.
        public static void sort(int[]My_array)
   {
         int minimum, temp;
         for(int index = 0; index < My_array.length-1; index++)
         {
             minimum = index;
             for(int scan = index+1; scan< My_array.length; scan++)
                 if (My_array[scan] < My_array[minimum])
                     minimum = scan;
             
             temp = My_array[minimum];
             My_array[minimum] = My_array[index];
             My_array[index]= temp;
         }
      }
   // a mutator method designed to advance the index and read values from the keyboard to apply to the respective index value.
        public static void InputArray(int[]My_array2)
        {
             for (int index = 0; index < 10; index++)
                 My_array2[index] = scan.nextInt();

        }
        
        public static int[] RandomArray()
        {
            int[]Random_Array = new int[10];
            Random rand = new Random();
            for (int index = 0; index < 10; index++)
            {
                Random_Array[index] = rand.nextInt(10);
            }
        return Random_Array;
        }
  /******************************************Defined as an expirament to get it to work outside of the driver.. solely for personal use.
        public static void swap(int[]My_array, int[]Swap) 
        {

            int temp, first, second; 
            first = My_array[0];
            second = My_array[1];
            
            temp = first;
            first = second;
            second = temp;
            System.out.println("Array prior to Swap: "  + x.toString(My_array));

         }
        **************************************/
      
    // a method to compute and return the mean of the values of an array, based on the sum and count of the array passed to the sum and count methods.
     public static float mean(int My_sum, int My_count)   // ( same as average, renamed for statistical purposes)
    {
        float mean= 0;
         mean = My_sum / My_count;
             return mean;
    }
        
    public static int mode(int[] My_array)
	{
	int LargestCurrentInt = 0;
	int mode = 0;
	int tempInt; // a temporary variable setup to store the first int, for which to check for repition against
	int currentInt = My_array[0]; //sets the currentInt value to that of the array at index val 0.
	int current = 0;

             for(int index=1; index < My_array.length; index++)  //used to advance the index, starting from 1.
             {	
		tempInt = currentInt;  // assigns tempInt the currentInts value for storage.
		currentInt = My_array[index]; //currentInt is assigned the value from the current index of My_array.
                    if(tempInt == currentInt)  //boolean if, if the tempInt matches the currentInt, apply counter to Current's value.
                    {
                       current++;
                    }
                    else 
                    {
                       current = 0;
                    }
                    if(current > LargestCurrentInt) // if the current value is > the largestCurrentInt it assigns mode the value from the current int.
                    {
                       mode = currentInt;
                       LargestCurrentInt = current;
                    }
	    }
 		return mode;
 	}

    
    /*a method to take an array passed from the driver class, setup a modulus to determine if the length has a remainder when divisible by 2 
    if TRUE, the sequence of operations is setup for an even # of index values, else, equations for odd.*/
     public static float median(int[]My_array) 
     {
         float median = 0;
         int temp = (My_array.length)/2;
         sort(My_array);
         if((My_array.length % 2) == 1 )//modulo function to check if the remainder is == to 1, if yes, execute for an odd array.
         {
            median = My_array[temp];
         }
            else median = (float)(My_array[temp-1] + My_array[temp])/2;
         
         return median;
     }
     
     public static float variance (int[]My_array, float average)
     {
         float variance;
         float sum = 0, addition =0;
         for (int index = 0; index < My_array.length; index++)
         {
             sum = My_array[index] - average;
             addition += Math.pow(sum, 2);
         }
         variance = addition/My_array.length;
         
         return variance;
     } 
     
     public static double standard_deviation(float variance)
     {
         double standard_deviation = 0;
         standard_deviation = Math.sqrt(variance);
         return standard_deviation;
     }
       
     public static int Absolute_Frequency(int[]My_array)
     {
         int counter = 0;
         int checkval;
         Random rand = new Random(); //random # generator.
         checkval = rand.nextInt(15); //createsa  random # and assigns it to checkval.
         for(int index = 0; index < My_array.length; index++)  //note: i can be used in place of index, but must be used throghout;
         {
             if(checkval== My_array[index]) //checks the value against the array @ that place in the index for equality. if true, counter is increased by 1.
                 counter++;
         }
         return counter;
     }
     
     public static float Relative_Frequency(int []My_array)
     {
         int counter = 0;
         int checkval;
         float r_frequency = 0;
         Random rand = new Random(); //random # generator.
         checkval = rand.nextInt(15); //createsa  random # and assigns it to checkval.
         for(int index = 0; index < My_array.length; index++)  //note: i can be used in place of index, but must be used throghout;
         {
             if(checkval== My_array[index]) //checks the value against the array @ that place in the index for equality. if true, counter is increased by 1.
                 counter++;
         }
         r_frequency = My_array.length / counter * 100;
         
         return r_frequency;
    }
     /*
       *The next block of code is used to display all the results from the methods.
       *
       */  
        
        public static void display_avg(String avg, float My_average )
        {
            System.out.println(avg + My_average);
        }
        
        public static void display_array(String display, int[]My_array)
        {
            System.out.println(Arrays.toString(My_array)); //outputs the values of the array in string format, to keep the array looking neat.
        }

        public static void display_min(String Array_min, int ArrayMinimum)
        {
            System.out.println(Array_min + ArrayMinimum);
        }
        
        public static void display_max(String Array_max, int ArrayMaximum)
        {
            System.out.println(Array_max + ArrayMaximum);
        }
       
       public static void display_count(String count, int My_count)
        {
            System.out.println(count + My_count);
        }
      
       public static void display_sum(String sum, int My_sum)
        {
            System.out.println(sum + My_sum);
        }
       
       public static void display_sort(String sortA,String sortB, int[]My_array)
       {
           System.out.println(sortA + My_array);
           sort(My_array);
           System.out.println(sortB + My_array);
       }
       
       public static void display_mean(String mean, float My_mean )
        {
            System.out.println(mean + My_mean);
        }
       
       public static void display_median(String median, float My_median)
       {
           System.out.println(median + My_median);
       }

       public static void display_mode(String mode, int My_mode)
       {
           System.out.println(mode + My_mode);
       }

       public static void display_variance(String variance, float My_variance)
       {
           System.out.println(variance + My_variance);
       }

       public static void display_StandardDeviation(String StandardDeviation, double My_StandardDeviation)
       {
           System.out.println(StandardDeviation + My_StandardDeviation);
       }

       public static void display_AbsoluteFrequency(String AbsoluteFrequency, float My_AbsoluteFrequency)
       {
           System.out.println(AbsoluteFrequency + My_AbsoluteFrequency);
       }

       public static void display_RelativeFrequency(String RelativeFrequency, float My_RelativeFrequency)
       {
           System.out.println(RelativeFrequency + My_RelativeFrequency);
       }

       public static void display_RandomArray(String Random_Array, int[]RandomArray)
       {
           System.out.println(Random_Array + RandomArray);
       }
}



