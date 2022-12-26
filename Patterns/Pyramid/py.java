import java.io.*;

public class py{
    public static void pyramid(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
           
            System.out.println();
        }
    }

    public static void main(String a[]){
        int n=5;
        pyramid(n);
    }
}