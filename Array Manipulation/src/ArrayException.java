import java.util.Scanner;
import java.util.InputMismatchException;
public class ArrayException extends Exception{
    public String getPriceDetails()
    {
        Scanner input=new Scanner(System.in);
        
        System.out.println("Enter the number of elements in the array");
        int limit=input.nextInt();
        
        int i;
        int arr[]=new int[limit];
        
        System.out.println("Enter the price details");
        
        for(i=0;i<limit;i++)
        {
        	try
        	{
        	arr[i]=input.nextInt();
        	}
        	catch(InputMismatchException ignore)
        	{
        		return "Input was not in the correct format";
        	}
        }
        
        System.out.println("Enter the index of the array element you want to access");
        
        try {
        	int index=input.nextInt();
        	return "The array element is " + arr[index];
        }
        catch (InputMismatchException ignore) {
            return "Input was not in the correct format";
        } catch (ArrayIndexOutOfBoundsException e) {
            return "Array index is out of range";
        }
    }
    public static void main(String[] args) {
        System.out.println(new ArrayException().getPriceDetails());
    }
}