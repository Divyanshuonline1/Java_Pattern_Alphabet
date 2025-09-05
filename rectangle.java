import java.util.Scanner;
public class rectangle {
    public static void main(String[] args) {
        System.err.println("Enter the number of rows");
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        System.err.println("Enter the number of columns");
        int c = sc.nextInt();
        for(int i=1;i<=r;i++){
            for(int j = 1;j<=c;j++){
                System.out.print("* ");
            }
            System.out.println();
        }  
    }
}
