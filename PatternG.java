public class PatternG {
    public static void main(String[] args) {
        for(int i = 1 ; i<= 6;i++){
            for(int j =1 ; j<=7;j++){
                if((i==1&&(j==3||j==4))||
                (i==2 &&(j==2||j==5))||
                (j==1&&(i==3||i==4))||
                (i==4&&(j>=4 && j<=6))||
                (i==5&&(j==2||j==4||j==7))||
                (i==6&&(j==3||j==4|| j==7))){
                    System.out.print("* ");
                }else{
                    System.out.print(" ");
                }
            }System.err.println();
        }
    }
}
