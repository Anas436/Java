
class Worker {
    // Workers personal Informations.
    String name;
    int id;
    String job_title;
    double salary;
    String company_name;
    
    // Created method.
    void Adding(String n, int i, String j_t, double s, String c_n){
        name = n;
        id = i;
        job_title = j_t;
        salary = s;
        company_name = c_n;
    }
    // Displying values.
    void showing(){
        System.out.println("\nName of Workers : "+name);
        System.out.println("Worker's Identification Numbers : "+id);
        System.out.println("Worker's Job Positions : "+job_title);
        System.out.println("Monthly Salary : "+salary);
        System.out.println("Company's Name : "+company_name);        
    }           
}


public class Anas_Mondol {
   
    public static void main(String[] args) {
       //Created objects.
       Worker obj1 = new Worker();
       Worker obj2 = new Worker();
       Worker obj3 = new Worker();
       
       obj1.Adding("Md. Anas Mondol",1935202011,"Cybersecurity Specalist",
                    3500000,"Grammeen Phone Limited");
       obj1.showing();
       
       obj2.Adding("Md.Raihan Khan",1935202001,"Software Engineer",25000,
                   "Walton Hi-Tec Industry Limited");
       obj2.showing();
       
       obj3.Adding("Md. Jahid Hasan",1935202008 ,"Internet of Thing Engineer",
                    35000,"Snap Hut Koren Company Limited");
       obj3.showing();
    }
    
}
