
public class LastOcurrance {

    public static int getLast(int arr[] , int tar){
        int lo = 0 , hi = arr.length-1 , ans = -1 ;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(arr[mid]==tar){
                ans = mid ;
                lo = mid+1;
            } else if(arr[mid] > tar){
                hi = mid-1;
            } else{
                lo = mid+1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {1,1,2,2,3,3,4,5,5,5,6,7,8,11};
        int tar = 5;
        int result = getLast(arr, tar);
        System.out.println("The element's first position is at : " + result + " index");
    }
        
    }

