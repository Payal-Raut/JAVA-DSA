public class AvgOfArr {
    public static double findAvg(int arr[]){
        int n = arr.length;
        int sum = 0 ;
        int left = 0 , right=n-1;
        while(left<=right){
            if(left==right){
                sum+=arr[left];
            } else{
            sum += arr[left]+ arr[right];
            }
            left++;
            right--;
        }
        return (double) sum/n;

    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        double avg=findAvg(arr);
        System.err.println("avg is : " + avg);
    }
}
