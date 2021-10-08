
import java.util.Scanner;

public class Anas_Mondol {

    public static void main(String[] args) {
       
        float number;
        Scanner object = new Scanner(System.in);
        System.out.print("Enter any number : ");
        number = object.nextFloat();
        
        if( number > 0 )
        {
            System.out.println("Your entered number is positive." +number);
        }
        
        else if( number < 0)
        {
          System.out.println("Your entered number is negative." +number);  
        }
        
        else
        {
          System.out.println("Your entered number is neither positive nor negative. "+number);
        }
                       
    }
    
}
