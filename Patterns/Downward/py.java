import java.io.*;
import java.util.Scanner;
public class py{
    public static void pyramid(int n){
        for(int i=n-1;i>=0;i--){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
           
            System.out.println();
        }
    }

    public static void main(String a[]){
        // System.out.println("Enter number of pattern rows :- ");
        // Scanner s = new Scanner(System.in);
        int n=Integer.parseInt(a[0]);
        pyramid(n);
    }
}