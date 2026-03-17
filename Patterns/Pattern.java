public class Pattern{
    public static void printPattern(int n){
        //upper Pattern
        for(int i =1 ; i<=n ; i++){
            //star
            for(int j = 1 ; j<=i ; j++){
                System.out.print("*");
            }
            //spaces
            for(int j = 1 ; j<=n-i ; j++){
                System.out.print("");
            }
            System.out.println();
    }
    //lower Pattern
        for(int i =n  ; i>=1 ; i--){
            //star
            for(int j = 1 ; j<=i ; j++){
                System.out.print("*");
            }
            //spaces
            for(int j = 1 ; j<=n-i ; j++){
                System.out.print("");
            }
            System.out.println();
    }}

    //other pattern code
    public static void printPattern1(int n){
        for(int i = 1 ; i<=n ; i++){
            for(int j = 1 ; j<=i;j++){
                if((i+j)%2==0){
                    System.out.print("1");
                }
                else{
                    System.out.print("0");
                }
               
            }
            System.out.println();
        }
    }

    
    public static void printPattern2(int n){
        //left side pattern
        for(int i =1 ; i<=n ; i++){


            for(int j = 1 ; j<=i ; j++){
                System.out.print(j);
            }
            //space
            for(int j = 1 ; j <= 2 * (n-i) ; j++){
                System.out.print(" ");
            }

            //right side pattern
            for(int j = i ; j>=1 ; j--){
                System.out.print(j);
            }
            System.out.println();
            }
    }
    
    
    public static void main(String[] args) {
        int n = 4;
        printPattern2(n);
    }
}