// 2. Abstract method in Java.
abstract class A{
    
    abstract void display() ;
}

class B extends A{
    
// calculate total electricity bill.
    @Override
    void display(){
        
    int unit = 150;
    float amount, total_amount, surcharge;    
   
    // electricity bill according to given conditions.
     if(unit <= 50)
    {
        amount = unit * 0.50f;
    }
    else if(unit <= 150)
    {
        amount = 25 + ((unit-50) * 0.75f);
    }
    else if(unit <= 250)
    {
        amount = 100 + ((unit-150) * 1.20f);
    }
    
    
    
    
    else
    {
        amount = 220 + ((unit-250) * 1.50f);
    }
    
    surcharge = amount * 0.20f;
    total_amount  = amount + surcharge;
    System.out.println("\nElectricity Bill : "+total_amount);
    
    }    
}

class C extends A{
   
    // find maximum between two numbers.
    @Override
    void display(){
     
        int number1 = 11; int number2 = 11;
        
    if(number1 > number2){
        
        System.out.println("\nEntered number is maximum ");        
    }
   
    
    
    
    
    if(number2 > number1){
        
        System.out.println("\nEntered number is maximum ");
    }

    if (number1 == number2){
        
        System.out.println("\nEntered both numbers are equal");
    }
  }

}
public class Anas {
    
    public static void main(String[] args) {
       
        
        A obj = new B();
        obj.display();
        
        A obj1 = new C();
        obj1.display();
    }
    
}
