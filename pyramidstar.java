public class pyramidstar {
    public static void main(String[] args) {
       for(int i = 1; i<=4;i++){
           for(int j = 1;j<=7;j++){
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
