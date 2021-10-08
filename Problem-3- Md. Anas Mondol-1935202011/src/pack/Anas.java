
package pack;

public class Anas implements NewInterface1 {
    
    @Override
    public void display(){
        
        int celsius = 0 ;
        int fahrenheit = 100;
        
        fahrenheit = (celsius * 9 / 5) + 32; 
  
        System.out.println("Fahrenheit : "+ fahrenheit);
        
    }
    
    @Override
    public void display1(){
        
       int celsius, fahrenheit = 0;
       
       celsius = (fahrenheit - 32) * 5 / 9;
       
       System.out.println("Celcius : "+celsius);
        
    }
    

    public static void main(String[] args) {
       
      Anas obj = new Anas ();
      obj.display();
      obj.display1();

  
    }
}