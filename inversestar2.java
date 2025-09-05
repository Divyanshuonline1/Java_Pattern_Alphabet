
public class inversestar2 {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter number of rows: ");
        // int n = sc.nextInt();

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {  
                if (j <= 5 - i) {
                    System.out.print(" ");   
                } else {
                    System.out.print("*");   
                }
            }
            System.out.println();
        }
        for(int i = 5; i >= 1; i--) {
            for(int j = 1; j <= 5; j++) {
                if(j>5-i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
