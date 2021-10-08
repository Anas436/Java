
// 7. Using Public access modifier.
package newpackage;

// Program to find total, average and percentage marks of five subjects.
public class A {
  
    int oop=75, phy=96, math=80, eee=80, bs=79;
    float  total, average, percentage;
    
    public void calculate(){
        
    total = oop + phy + math + eee + bs;
    average = total/5.0f;
    percentage = (total/500.0f)*100;  
        
    System.out.println("\nTotal marks : " +total);
    System.out.println("\nAverage marks : " +average);
    System.out.println("\nPercentage marks : " +percentage);
      
    }           
}
