public class LowerandUpperBound {

    public static int lowerBound(int arr[] , int x){
        int lo = 0 , hi = arr.length-1  ;
        int ans = arr.length;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(arr[mid] == x){
                ans = mid ;
                hi = mid-1;
            } else if(arr[mid] < x){
                lo = mid+1 ;
            } else{
                hi = mid-1;
            }
        } 
        return ans;
    }
    public static int upperBound(int arr[] , int x){
        int lo = 0 , hi = arr.length-1  ;
        int ans = arr.length;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(arr[mid] == x){
                ans = mid ;
                lo = mid + 1;
            } else if(arr[mid] < x){
                lo = mid+1 ;
            } else{
                hi = mid-1;
            }
        } 
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,2,3};
        int x = 2;
         
        int lowResult = lowerBound(arr, x);
        int upperResult=upperBound(arr, x);
        System.out.println(" Lower bound of x is " + lowResult);
        System.out.println(" Upper bound of x is " + upperResult);
    }
}
