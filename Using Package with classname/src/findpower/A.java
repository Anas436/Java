
//2. Package name.classname;
package findpower;

// Program to find power of a number.

import static java.lang.Math.pow;

public class A {
    
    public void calculate(double base, double exponent){
        
        System.out.println("\nFind power entered of any numbers : "+ pow(base, exponent ));
               
    }
    
    // Program to print day of week names using switch...case.
    
    public void calculate1(int week ){
        
      switch(week) {
        case 1: 
            System.out.println("Saturday");
            break;
        case 2: 
            System.out.println("Sunday");
            break;
        case 3: 
            System.out.println("Monday");
            break;
        case 4: 
            System.out.println("Tuesday");
            break;
        
        
          case 5: 
            System.out.println("Wednesday");
            break;
        case 6: 
            System.out.println("Thrusday");
            break;
        case 7: 
            System.out.println("Friday");
            break;
        default: 
            System.out.println("\nInvalid input! Please enter week number between 1-7.");
        
        }
    }

}
