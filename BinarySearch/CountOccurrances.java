public class CountOccurrances{

    public static int findfirstindex(int arr[] , int tar){
        int lo = 0 , hi = arr.length-1 , first=-1 , ans = -1;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(arr[mid] == tar){
                ans = mid ;
                hi = mid-1;
            } else if(arr[mid] < tar){
                lo = mid+1;
            } else{
                hi = mid-1;
            }
        }
        return ans;
    }
    public static int findlastindex(int arr[] , int tar){
        int lo = 0 , hi = arr.length-1 , first=-1 , ans = -1;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(arr[mid] == tar){
                ans = mid ;
                lo = mid+1;
            } else if(arr[mid] < tar){
                lo = mid+1;
            } else{
                hi = mid-1;
            }
        }
        return ans;
    }



    public static void main(String[] args) {
        
        int arr[] = {0,1,1,2,2,2,2,2,3,4,5};
        int tar = 2 ;
        int res = findfirstindex(arr, tar);
        // System.out.println(res);
        int res1 = findlastindex(arr, tar);
        // System.out.println(res1);
        int answer = (res1-res) + 1;
        System.out.println(answer);
        


    
}
}

