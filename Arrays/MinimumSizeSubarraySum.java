public class MinimumSizeSubarraySum {
    public static int minSubarraySum(int arr[] , int target){
        int sum=0;
        int minSize=Integer.MAX_VALUE;
        int left = 0;
        for(int right = 0 ;right<arr.length ; right++){
            sum+=arr[right];
        
            while(sum>=target){
                minSize = Math.min(minSize , right-left+1);
                sum-=arr[left];
                left++;//shrink the window
        }
    }
    return (minSize != Integer.MAX_VALUE ? minSize : 0);
    }
    
    public static void main(String[] args) {
        int arr[]={2,3,1,2,4,3,10};
        int target = 17 ;
        int result = minSubarraySum(arr, target);
        System.out.println("Minimum Subarray Length : " + result);

    }
}
