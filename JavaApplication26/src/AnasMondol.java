class Student {
    
    int id;
    int age;
    double cgpa;
    String name;
    
    
    
    Student( int i, int a, double c,String n){
        
        id=i;
        age= a;
        cgpa= c;
        name = n;           
    }
    
    Student (int i, int a, String n){
        
        id = i;
        age= a;
        name = n;
           
    }
    
    void Displying(){
        System.out.println(id+" "+age+" "+cgpa+" "+name);
    
}
    void Displying1(){
        System.out.println(id+" "+age+" "+name);
    }
}

public class AnasMondol {


    public static void main(String[] args) {
        

        
        Student obj1=new Student (2011,18,3.50,"Anas");
        obj1.Displying();
        Student obj2=new Student (2012,19,"Sahon Sir");
        obj2.Displying1();
        
    }
    
}
