import java.util.Scanner;
public class TransposeMatrix {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows : ");
        int row = sc.nextInt();
        System.out.println("Enter the number of columns : ");
        int col = sc.nextInt();
        int matrix[][]=new int[row][col];
        System.out.println("Enter the elements : ");
        
        //take elements
        for(int i=0 ; i<row ; i++){
            for(int j = 0 ; j<col;j++){
                matrix[i][j]= sc.nextInt();
            }
        }
        System.out.println("Original Matrix : " + " ");
        for(int i=0 ; i<row ; i++){
            for (int j = 0; j<col; j++) {
            System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
    }
        System.out.println(" Transpose Matrix : "+ " ");
            for(int i=0 ; i<col ; i++){
                for (int j = 0; j<row; j++) {
                System.out.print( matrix[j][i] + " ");
            }
            System.out.println();
    }
    
        sc.close();
    }
}
