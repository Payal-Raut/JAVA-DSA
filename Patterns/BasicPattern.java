public class BasicPattern{
    public static void printPattern(int n){
        for(int i = 1; i<=n; i++){
            for(int j = 1 ;j<=n ; j++){
                System.out.print("*");
            }
             System.out.println();
        }
       
    }

    public static void main(String[] args) {
        int n = 4 ;
        printPattern(n);
    }
}