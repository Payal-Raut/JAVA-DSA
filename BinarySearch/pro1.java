public class pro1 {

    public static int search(int arr[] , int tar){
        int n = arr.length;
        int lo = 0;
        int hi=n-1;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(arr[mid]==tar) {
                return mid;
            } else if(arr[mid]<tar){
                lo = mid+1;
            } else{
                hi=mid-1;
            }
                
        }
    return -1;
    }
    
    public static void main(String[] args) {
        int arr[]={2,4,8,20,40};
        int tar=20;
        int result = search(arr,tar);
        System.out.println("The target is at index :" +result);
        
    }
}
