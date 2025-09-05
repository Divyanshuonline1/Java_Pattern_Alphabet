public class PatternJ {
    public static void main(String[] args) {
        for(int i =1;i<=7;i++){
            for(int j = 1;j<=4;j++){
                if((j==4 && i<=5)||(j==1&&(i==4||i==5))||(i==6&&(j==3|| j==2))|| i==1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }System.out.println();
        }
    }
}
