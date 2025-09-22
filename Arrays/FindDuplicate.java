
import java.util.HashSet;

public class FindDuplicate {
    public boolean returnduplicate(int arr[]){
        HashSet <Integer> set = new HashSet<>();
        for(int i = 0 ; i<arr.length;i++){
            if(set.contains(arr[i])){
                return true;
            }
            set.add(arr[i]);
        }
        return false;

    }
    public static void main(String[] args) {
        FindDuplicate fd = new FindDuplicate();
        int arr[]={1,2,3};
        System.out.println(fd.returnduplicate(arr));
    }
}
