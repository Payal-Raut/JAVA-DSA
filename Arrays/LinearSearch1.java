public class LinearSearch1 {
    public static int search(int arr[],int target){
        for(int i = 0 ; i<arr.length ; i++){
            if(arr[i]==target){
                System.err.println("Found element at index : " + i);
                return i;
            }
        }
        System.out.println("Element not found");
        return -1; // ✅ standard for "not found"
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int target=6;
        int res=search(arr , target);
        System.out.println("Search result: " + res);
    }
}
