class FindMinMax{
    //-----brute force approach--------
    // public static int findMin(int arr[]){
    //     int min_val=Integer.MAX_VALUE;        
    //     for(int i = 0;i<arr.length;i++){
    //         if(arr[i]<min_val){
    //             min_val=arr[i];
    //         }
    // }
    // return min_val;
    // }
    // public static int findMax(int arr[]){
    //     int max_val=Integer.MIN_VALUE;      
    //     for(int i = 0;i<arr.length;i++){
    //         if(arr[i]>max_val){
    //             max_val=arr[i];  
    //         }
    // }
    // return max_val;
    // }
//---------2 pointer approach----------
public static int findMin(int arr[]){
        int min_val=Integer.MAX_VALUE;
        int left=0, right=arr.length-1; //{1,2,3,4,100} 
        while(left<=right){
        if(arr[left]<min_val){
            min_val=arr[left];
        }
        if(arr[left]<min_val){
            min_val=arr[right];
        }
        left++;
        right--;   
    }
    return min_val;
}
    public static int findMax(int arr[]){
        int max_val=Integer.MIN_VALUE;  //{1,2,3,4,100};
        int left=0, right=arr.length-1; //{1,2,3,4,100} 
        while(left<=right){
        if(arr[left]>max_val){
            max_val=arr[left];
        }
        if(arr[right]>max_val){
            max_val=arr[right];
        }
        left++;
        right--;   
    }
    return max_val;
}

    public static void main(String[] args) {
        int arr[]={1,2,3,4,100};

        int maxresult=findMax(arr);
        int minresult=findMin(arr);
        System.out.println("Minimum element: " + minresult);
        System.out.println("Maximum element: " + maxresult);
    }
}