public class Binary_search {
    public static int searching(int num[] , int target){
        int start = 0 ; 
        int end = num.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(num[mid]==target){
                return mid ;
            }
            if(num[mid]<target){    // target is at right side of mid 
                start = mid+1;
            } else{
                end = mid-1;   // target is at left side of mid 
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int num[] ={1,2,3,4,5,7,8,9,10};
        int target = 11;
        int index = searching(num, target);
        System.out.println("Found at "  + index);
    }
    
}
