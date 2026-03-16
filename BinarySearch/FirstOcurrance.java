
public class FirstOcurrance {
    public static int getFirst(int arr[] , int target){
        int lo = 0 , hi = arr.length-1 , ans = -1 ;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(arr[mid]==target){
                ans = mid ;
                hi = mid-1;
            } else if(arr[mid] > target){
                hi = mid-1;
            } else{
                lo = mid+1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {1,1,2,2,3,3,4,5,5,5,6,7,8,11};
        int target = 5;
       int result = getFirst(arr, target);
       System.out.println("The element's first position is at : " + result + " index");
    }
}
