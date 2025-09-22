import java.util.Scanner;
public class PrintMatrix {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows : ");
        int row = sc.nextInt();
        System.out.println("Enter the number of columns : ");
        int col = sc.nextInt();

        System.out.println("Enter the elements : ");
        int matrix[][]=new int[row][col];
        //take elements
        for(int i=0 ; i<row ; i++){
            for(int j = 0 ; j<col;j++){
                matrix[i][j]= sc.nextInt();
            }
        }
        System.out.println("Output : " + " ");
        for (int[] matrix1 : matrix) {
            for (int j = 0; j<matrix[0].length; j++) {
                System.out.print(matrix1[j] + " ");
            }
        }
        sc.close();
    }
}
