class Linear_search{
    public static int searching(int num[] , int target){
        for(int i = 0 ; i<num.length; i++){
            if(num[i] == target){
                return i ;
            }
        }
        return -1 ; 
    }

    public static void main(String s[]){
        int num[] = {2,3,4,5,6,7,8,9,10,12,14,16};
        int target = 3;
        int index = searching(num,target);
        if(index==-1){
            System.out.println("Not found");
        }
        else{
            System.out.println("Found at index " + index);
        }

    }
}