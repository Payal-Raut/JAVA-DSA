public class SearchInsertPosition{

    public static int searchPos(int arr[] , int tar){
        int lo= 0 , hi = arr.length-1 ;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(arr[mid] == tar){
                return mid ;
            } else if(arr[mid] < tar) {
                lo = mid+1;
            } else {
                hi = mid-1 ;
            }
        }
        return lo;

    }
    public static void main(String[] args) {
    int arr[]={1,3,5,6};
    int tar = 5 ;           // test case == check for  tar = 2 , 7 
    
    int result1 = searchPos(arr, tar);
    
    System.out.println("Result of target is : " + result1);
    
}
}
