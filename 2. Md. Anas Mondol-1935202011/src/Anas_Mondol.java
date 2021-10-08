
class Simple_Interest{
    
    float principle;
    float time;
    float rate;
    float SI;
    
    
    Simple_Interest (float p, float t, float r, float s){
        
        principle = p;
        time = t;
        rate = r;
        SI = s;
        
    } 
    void Showing(){
        SI = (principle*time*rate)/100;
        System.out.println("\nSimple Interest : "+SI);
    }       
}
  


public class Anas_Mondol {
   
    public static void main(String[] args) {
       
        Simple_Interest obj1 = new Simple_Interest (1200.00f, 
                2.00f, 5.4f, 00 );
        obj1.Showing();
        
        Simple_Interest obj2 = new Simple_Interest (120.00f,
                4.00f, 3.90f, 00);
        obj2.Showing();
        
        Simple_Interest obj3 = new Simple_Interest (110.70f, 
                9.00f, 2.89f,00);
        obj3.Showing();
    }
        
}

    
            
       
   
    
    
