public class GetFloor {

    public static int findFloor(int arr[] , int x){
        int lo = 0 , hi = arr.length-1 , ans = -1;
        while(lo < hi){
            int mid = lo + (hi-lo)/2 ;
            if(arr[mid] <= x){
                ans = mid;
                lo = mid+1;
            } else{
                hi = mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,8,10,10,12,19};
        int x = 5 ;
        int result = findFloor(arr, x);
        System.out.println(result);
    }
}
