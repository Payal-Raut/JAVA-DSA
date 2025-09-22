public class Reverse_array {
    public static int reverse(int num[]){
        int start = 0; 
        int end = num.length-1;
        while(start<end){
            int temp = num[end];
            num[end]=num[start];
            num[start] = temp ;
            start++;
            end--;
        }
            return -1 ; 
    }
    public static void main(String[] args) {
        int num[] ={2,3,4,5,6,7,8};
        reverse(num);
        for(int i = 0 ;i<num.length ; i++){
            System.out.print( num[i]+"");
        }
        System.out.println("");
    }
}
