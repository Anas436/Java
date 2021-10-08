
// 6.Using Protected access modifier.
package mypackage;

// Program to convert temperature from Celsius to Fahrenheit.
public class A {
    
   protected void calculate(int celsius, int fahrenheit){
        
         fahrenheit = (celsius * 9 / 5) + 32;
        
        System.out.println("\nConverted celsius to fahrenheit : "+fahrenheit+" fahrenheit");
        
    }
   
   // Program to convert temperature from fahrenheit to celsius.
   protected void calculate1(int fahrenheit,int celsius){
       
       celsius = (fahrenheit - 32) * 5 / 9; 
       
       System.out.println("\nConverted fahrenheit to celsius : "+ celsius+" celsius");
   }
       
}
