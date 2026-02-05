public class HollowRectangle {
    public static void hollow_rectangle(int totCol , int totRow){
        for(int i = 1 ; i<=totRow; i++){
            for (int j = 1 ; j<= totCol ; j++){
                if(i==1 || i == totRow || j==1 || j==totCol)
                    {
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String s[]){
        int totCol = 5 ;
        int totRow = 4;
        hollow_rectangle(totCol, totRow);
    }

}
