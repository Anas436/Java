
class Student_Informations1 {
    // Student Personel informations.
    int  id;
    String name;
    int batch;
    char section;
    String gender;
    String program;
    
    // Created Methods.
    void Add_Information1(int i,String n,int b,char A,String p,String g){
        
        id = i;
        name = n;
        batch = b; 
        section = 'A';
        gender = g;
        program = p;
        
    } 
    // Displaying Informations.
    void showing(){
    
        System.out.println("\nstudent ID :"+id);
        System.out.println("Students Name : "+name);
        System.out.println("Students Studying Bacth : "+batch);
        System.out.println("Students Section : "+section);
        System.out.println("Students Program : "+program);
        System.out.println("Students Gender : "+gender);
        
    }
              
}

public class Anas_Mondol {
   
    public static void main(String[] args) {
        // Created objects.
        Student_Informations1 obj1 = new Student_Informations1();
        Student_Informations1 obj2 = new Student_Informations1();
        Student_Informations1 obj3 = new Student_Informations1();
        
        obj1.Add_Information1(1935202011,"Md.Anas Mondol",52,'A',"Male","B.Sc in CSE(DAY)");
        obj1.showing();
        
        obj2.Add_Information1(1935202037,"Mahdy Hasan Miraz",52,'A',"Male","B.Sc in CSE(DAY)");
        obj2.showing();
        
        obj3.Add_Information1(1935202011,"Md. Rakib Mia", 52, 'A',"Male","B.Sc in CSE(DAY)");
        obj3.showing();
                      
    }
    
}
