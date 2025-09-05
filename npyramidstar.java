import java.util.Scanner;
public class npyramidstar {
    public static void main(String[] args) {
        System.out.println("Enter the number of rows and columns");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       for(int i = 1; i<n;i++){
           for(int j = 1;j<=n+2;j++){
               if(i==4 ||j==4){
                System.err.print("*");
               }else{
                if(i==2 && (j==3 || j==5)){
                    System.out.print("*");
                }else{
                    if(i == 3 && (j==2 || j==3 || j==5 || j==6)){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
               }
           }
           System.out.println();
       }
    }
}
