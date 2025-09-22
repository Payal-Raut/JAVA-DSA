public class RemoveDuplicatesFromSortedArray {
    public static int removeDuplicates(int arr[]){
        if(arr.length ==0) return 0;
        int left_count=0;

        for(int right = 1 ; right<arr.length;right++){
            if(arr[right]!=arr[left_count]){
                left_count++;
            }
            arr[left_count] = arr[right];

        }
        return left_count+1;
    }
    public static void main(String[] args) {
        int arr[]={1,1,2,4,5,5,6,7,8,8,9};
        int newLength=removeDuplicates(arr);
        System.out.println("New Length = " + newLength );
        for(int i = 0 ; i<newLength ; i++){
            System.out.print(arr[i] +" ");
        }
    }
}
