import java.util.Scanner;
public class nHollowTriangle {
    public static void main(String args[]){
        System.out.println("Enter the number of rows and columns");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=(2*n-1);j++){
               if(j==(n-i+1) || j==(n+i-1)|| i==n){
                   System.out.print("*");
               }
               else{
                   System.out.print(" ");
               }
            }System.out.println();

        }
}}
