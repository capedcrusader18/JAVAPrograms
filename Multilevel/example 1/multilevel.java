// import java.util.*;
import java.io.*;
class patient{
    String name;
    int pid;
    patient(String name, int pid){
        this.pid=pid;
        this.name=name;  
    }
    public void pinfo(){
        
        System.out.println("Patient ID - " + pid);
        System.out.println("Patient Name - " + name);
   
    }
    
}
class employee extends patient{
    int eid;
    String name;
    employee(int eid,String ename){
        super("abc",1);
        this.eid=eid;
        this.name=ename;
    }
    public void einfo(){
             
        System.out.println("Employee ID - " + eid);
        System.out.println("Employee ID - " + name);
  
    }
}
class multilevel extends employee{

    multilevel(int eid, String ename) {
        super(eid, ename);
        //TODO Auto-generated constructor stub
    }

    public static void main(String a[]) throws IOException{
        // BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        employee emp = new employee(1,"xyz");
        // System.out.println("Enter Patent id");
        // int pid=Integer.parseInt(sc.readLine());
        // System.out.println("Enter patient name");
        // String name=sc.readLine();
        emp.pinfo();
        emp.einfo();
    }
}