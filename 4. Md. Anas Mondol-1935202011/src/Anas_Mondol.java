
import java.util.Scanner;

public class Anas_Mondol {

    public static void main(String[] args) {
       
    float a, b, c;
        Scanner object = new Scanner (System.in);
        
        System.out.print("Enter any three numbers : ");
        
        a = object.nextFloat();
        b = object.nextFloat();
        c = object.nextFloat();
        
        if ( a > b && a > c)
        {
            System.out.println("Largest number is : " + a);
        }
        
        else if ( b > c )
        {
            System.out.println("Largest number is : " +b);
        }
        
        else
        {
            System.out.println("Largest number is : " +c);
        }
    }        
    
    
}
