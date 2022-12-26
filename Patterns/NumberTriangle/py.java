import java.io.*;
import java.util.*;
public class py{
    public static void main(String b[]){
        int a = Integer.parseInt(b[0]);
        for(int i=1; i<=a; i++){
            for(int j=a; j>=i; j--){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
        
    }
}