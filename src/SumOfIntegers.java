import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumOfIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int integer1 = 0;
		int integer2 = 0;
		int sum = 0;
		System.out.println("Please enter first integer");
		
		
		 try
         {
                 //get integer1 from console
                 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                 integer1 = Integer.parseInt(br.readLine());
         }
		 
         //if invalid value was entered
         catch(NumberFormatException ne)
         {
                 System.out.println("Invalid integer value" + ne);
                 System.exit(0);
         }
         catch(IOException ioe)
         {
                 System.out.println("IO Error :" + ioe);
                 System.exit(0);
         }
		 
		 System.out.println("Please enter second integer");
		 try
         {
                 //get integer2 from console
                 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                 integer2 = Integer.parseInt(br.readLine());
         }
		 
         //if invalid value was entered
         catch(NumberFormatException ne)
         {
                 System.out.println("Invalid integer value" + ne);
                 System.exit(0);
         }
         catch(IOException ioe)
         {
                 System.out.println("IO Error :" + ioe);
                 System.exit(0);
         }
		 
		 sum = integer1 + integer2;
		 System.out.println("\nSum of the two numbers: " + integer1 + " + " + integer2 + " = "+ sum);
		 
	}

}
