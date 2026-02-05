public class invertedStarPattern {
    
    public static void main(String s[])
    {
         int n = 5 ;
        for (int i = 1 ; i<=n ; i++){
            for(int j = 1 ; j<=4-i+1 ; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
