
// 1. Using packagename.*;

package CheckTriangle;

//Program to check equilateral, scalene or isosceles triangle.

import static java.lang.Math.sqrt;
public class A {
    
    public void calculate(int side1, int side2, int side3){
        
       if(side1==side2 && side2==side3) 
    {
          //If all sides are equal.
        System.out.println ("Equilateral triangle.");
    }
    else if(side1==side2 || side1==side3 || side2==side3) 
    {
        // If any two sides are equal .
        System.out.println("Isosceles triangle.");
    }
    else 
    {
        // If none sides are equal.
        System.out.println("Scalene triangle.");
    }
               
    }
    
















// Program to find square root of any number.
    public void calculate1(double number){
        
       System.out.println("\nSquare root of entered numbers : "+ sqrt(number));
        
    }

}





