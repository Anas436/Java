
class convert{
    int centimeterToMeterKilo(){
        return(0);
    }
}

class meter extends convert {
    int centiMeterToMeterKilo(int cm){
        return(cm/100);
    }
}
class kilometer extends convert {
    int centiMeterToMeterKilo(int cm){
        return(cm/100000);
    }
 }
public class Anas_Mondol {

    public static void main(String[] args) {
        
        meter obj= new meter();
        System.out.println("Centimeter converted to  length in meter "
                        + ":"+obj.centiMeterToMeterKilo(1000)+" m");
        
        kilometer obj1 = new kilometer();
        System.out.println("Centimeter converted to  length in kilometer "
                + ":"+obj1.centiMeterToMeterKilo(200278)+" km");
                                      
    }
    
}
