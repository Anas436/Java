
import static java.lang.Math.pow;

// 1. Abstract method in Java.
abstract class A{
    
   abstract void display();
    
}

class B extends A{
   // calculate simple interest. 
   @Override
   void display( ) {
    int principle = 1600; float rate = 9.8f; int time = 6; double SI;
       
       
       SI = (int) ((principle * time * rate) / 100);
      
       System.out.println("\nSimple Interest : "+SI);
   }           
   
}













class C extends A{
    
    // calculate compound interest.
    @Override
    void display(){
        
     int principle = 1990; float rate = 9.9f; int time = 9; double CI;   
        
     CI = principle* (pow((1 + rate / 100), time));  
     
     System.out.println("\nCompound Interest : "+ CI);
        
    }
    
}

public class Anas {

    public static void main(String[] args) {
       
      A obj = new B();
      obj. display();
      
      A obj1 = new C();
      obj1.display();
        
    }
    
}
