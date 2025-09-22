public interface ContainerWithMostWater {
    public static int mostWater(int arr[]){
        int left = 0 , right = arr.length-1;
        int maxwater=0;
        while(left<right){

            int height = Math.min(arr[left] , arr[right]);
            int width = right- left;
            int currentWater = height * width;
            maxwater = Math.max(maxwater,currentWater);
            if(arr[left]<arr[right]){
                left++;
            }else{
                right--;
            }
        }
        return maxwater;
   
    }
    public static void main(String[] args) {
        int result= mostWater(new int[]{1,8,6,2,5,4,8,3,7});
        System.out.print(result);
    }
}
