public class LargestInArray {
    public static int getLargest(int num[]){
        int largest = Integer.MIN_VALUE;
        for(int i =0 ; i<num.length ; i++){
            if(largest<num[i]){
                largest = num[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int num[]={33,23,45,65,32,126};
        System.out.println("Largest val is : " + getLargest(num));
    }
}
