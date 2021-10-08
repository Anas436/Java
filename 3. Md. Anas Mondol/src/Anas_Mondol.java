import static java.lang.Math.pow;

class Compound_Interest{
    
    double principle;
    int time;
    double rate;
    double CI;
    
    Compound_Interest(double p, int t, double r, double c){
        principle = p;
        time = t;
        rate = r;
        CI =c;   
    }
    
    void Showing(){
        
       CI =  principle*(pow((1 + rate / 100), time));
       System.out.println ("\nCompound Interest : "+CI);    
    }
}                      






public class Anas_Mondol {

    public static void main(String[] args) {
       
        Compound_Interest obj1 = new Compound_Interest(1200.0,
                2, 5.4, 00 );
        obj1.Showing();
        
        Compound_Interest obj2 = new Compound_Interest (1000.0, 
                4, 6,00);
        obj2.Showing();
        
        Compound_Interest obj3 = new Compound_Interest(1400.0,
                3, 2,00);
        obj3.Showing();
    }
    
}
