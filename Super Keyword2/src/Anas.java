
// super keyword using constructor.

import static java.lang.Math.pow;

class simpleInterest{
   
    double principle; int time; int rate; double SI;
    
    simpleInterest(double principle, int time, int rate, double SI){
        
       this.principle = principle;
       this.time = time;
       this.rate = rate;
       this.SI = SI;
    }
}

class compoundInterest extends simpleInterest {
   double CI;
   
    compoundInterest(double principle, int time, int rate, double SI, double CI) {
        
        super(principle, time, rate, SI);
        
        this.CI = CI;
    }

    
    void display1(){
       
        SI = (principle * time * rate) / 100;
        System.out.println("Simple Interest: "+ SI);
    }
    
             
   
    
    void display2(){
     
        CI =  (int) ((pow((1 + rate / 100), time))* principle);
        System.out.println("\nCompound Interest: "+ CI);
        
    }
}

public class Anas {


    public static void main(String[] args) {
        
       
        compoundInterest obj1 = new compoundInterest(1200,2,5,0,0);
        obj1.display1();
        obj1.display2();
                            
    }
    
}
