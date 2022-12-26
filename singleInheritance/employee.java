class employee{
    public void info(String name, int id){
        String nm=name;
        int eid=id;

        System.out.println("Name of the Employee " +nm);
        System.out.println("ID of the Employee " +eid);
    }
}
class esalary extends employee{
    public void calc(int sal){
        int salary=sal;
        float bonus = salary*10/100;
        float total = salary + bonus;
        
        System.out.println("Salary of the Employee " +salary);
        System.out.println("bonus of the Employee " +bonus);
        System.out.println("Total Income of the Employee " +total);
        
    }
    public static void main(String[]a){
        esalary obj = new esalary();
        obj.info("Loyela", 1);
        obj.calc(50000);
    }
}