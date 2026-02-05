public class InvertedRotatedHalfPyramid {

    public static void inverted_Rotated_HalfPyramid(int n){
        //outer loop
        for(int i = 1 ; i<=n ; i++){
            //Print the space
            for(int j = 1 ; j <= n-i; j++){
                System.out.print(" ");
            }
            for(int k = 1 ; k <= i; k++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    public static void main(String s[]){
        
        inverted_Rotated_HalfPyramid(4);
    }
}
