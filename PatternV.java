public class PatternV {
    public static void main(String[] args) {
        for(int i = 1; i<=7;i++){
            for(int j = 1; j<=8;j++){
                if(i==1&&(j==1|| j==8)||(i==3&&(j==2|| j==7))||(i==5&&(j==3|| j==6))||(i==7&&(j==4|| j==5))){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }System.err.println();
        }
    }
}
