
import java.util.Scanner;

public class Anas_Mondol {

    public static void main(String[] args) {
        
        int number;
        System.out.print("Enter any integer number : ");
        Scanner object = new Scanner (System.in);
        
        number = object.nextInt();
        
        if(number % 2 == 0)
        { 
            System.out.println("Your entered number an Even.");
        }
     
        else
        {
            System.out.println("Your entered numer an Odd");
        }
          
    }
    
}
