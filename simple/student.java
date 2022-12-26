public class student{
    public void info(int r, String n){
        int rollno=r;
        String name=n;

        System.out.println("Roll Number and Name of the Student :- " + rollno + " " + name);
    }
    public static void main(String[] a){
        student s = new student();
        s.info(1,"abc");
    }
}