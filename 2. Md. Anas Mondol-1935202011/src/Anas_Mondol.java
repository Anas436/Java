
import java.util.Scanner;

public class Anas_Mondol {

    public static void main(String[] args) {
        
       char ch;
        Scanner object = new Scanner(System.in);
        System.out. print("Enter any Alphabet : ");
        ch = object.next().charAt(0);
        
        if ( ch =='A' || ch =='a' || ch =='E' || 
            ch =='e' || ch =='I' || ch =='i' || ch == 'O' || ch =='o'
            || ch== 'U' || ch == 'u')
        {
            System.out.println("Entered Alphabet is Vowel.");
        }
        
        else
        {
            System.out.println("Entered Alphabet is Consonant.");
        }
             
    }
    
}
