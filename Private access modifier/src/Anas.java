
//4. Using Private Access modifier. 

// Program to calculate profit or loss.
class A{
    
   private int cost_price= 1000, selling_price=1500, amaount=0; 

   private void calculate(){
        
     if(selling_price > cost_price)
    {
        /* Calculate Profit */
        amaount = selling_price - cost_price;
        System.out.println("Profit = "+amaount);
    }
    else if(cost_price > selling_price)
    {
        /* Calculate Loss */
        amaount = cost_price - selling_price;
        System.out.println("Loss = "+amaount);
    }
    else
    {
        /* Neither profit nor loss */
       System.out.println("No Profit No Loss.");
    }   
                 
    }
                      
}




public class Anas {
     
    public static void main(String[] args) {
       
        A obj = new A();
        obj.calculate();
         
    }
    
}
