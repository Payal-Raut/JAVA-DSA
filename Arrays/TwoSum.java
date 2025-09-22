class TwoSum{
    public static int[] findTwoSum(int arr[],int target){
        int left = 0 ;
        int right=arr.length-1;
        while(left<right){
            
                int sum = arr[left]+arr[right];
                if(sum==target){
                    return new int[]{arr[left] , arr[right]};
                }
                else if(sum<target){
                    left++;
                } else if(sum>target){
                    right--;
                }
            }
     return new int[]{};
    }
   
    public static void main(String[] args) {
        int arr []= {2,4,5,6,7};
        int target = 1 ;
        int res[]=findTwoSum(arr, target);
        if(res.length>0){
            System.out.println("Pair Found " + res[0] + " ," + res[1]);
        } else{
            System.out.println("Pair Not Found");
        }
    }
}