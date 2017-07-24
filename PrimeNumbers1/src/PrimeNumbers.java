import java.util.ArrayList;
import java.util.Scanner;

public class PrimeNumbers {
	public static void main(String args[])
    {
		 
         int upperLimit;
         int x;
         
         int flag = 0;
         
         Scanner s = new Scanner(System.in);           
         System.out.println ("Enter the upper limit :"); 
         upperLimit = s.nextInt();
         long startTime = System.currentTimeMillis();
         System.out.println ("The prime numbers between 2 and " + upperLimit + "are: ");
         
         
         ArrayList<Integer> p = new ArrayList<Integer>();
         p.add(2);     //adds first prime number as a starting point   
        
         System.out.println(p.get(0));
         
         for(int i = 3; i <= upperLimit; i++)
         {
        	 for( x = 0; x < Math.sqrt(p.size()); x++) 
             {
                 if(i % p.get(x) == 0) //checks against all prime numbers currently in list which updates, saves time
                 {
                     flag = 0;                     
                     break;
                 }
                 else
                 {
                     flag = 1;                     
                     
                 }
             }
             if(flag == 1)
             {
            	 p.add(i); //adds prime number to list
                 System.out.println(i); //prints the rest of the prime numbers
                 
             }
         }
          
         System.out.println("There are "+ p.size() +" prime numbers");
         final long endTime = System.currentTimeMillis();
         

         System.out.println("Total execution time: " + ((double)(endTime - startTime)/1000)+" seconds" );
    }
}
