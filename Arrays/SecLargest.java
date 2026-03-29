public class SecLargest{

    public static int findSecLarge(int arr[]){
         int max = arr[0];
        int secLarge = Integer.MIN_VALUE;
        
        for(int i = 1 ; i < arr.length ; i++){
           
            if(arr[i] > max){
                secLarge = max ;
                max = arr[i]  ;
            } else if(arr[i] < max && arr[i] > secLarge){
                secLarge = arr[i];
            } 
            

        }
        return secLarge;
    }
    public static void main(String s[]){
        int arr[] = {8,8,7,6,5};
        int result = findSecLarge(arr);
        System.out.println("Second largest element is : " + result);

    }
}