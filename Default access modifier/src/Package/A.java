
//5. Using Default Access modifier.
package Package;

// Program to check even or odd using switch...case.

import static java.lang.Math.sqrt;

class A {
    
    void calculate(int number ){
        
       switch(number % 2){
            
        case 0: 
            System.out.println("\nNumber is Even");
            break;

        case 1: 
            System.out.println("\nNumber is Odd");
            break;
        }
    }
    
    // Program to find area of an equilateral triangle.
    void calculate1(int side){  
     
        System.out.println("\nArea of equilateral triangle : "
                + ""+(sqrt(3) / 4)*(side * side)+" sq.units");       
    }          
}
