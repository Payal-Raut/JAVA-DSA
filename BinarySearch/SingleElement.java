public class SingleElement {

    public static int singleNonDuplicate(int[] nums) {

        int lo = 0, hi = nums.length - 1;

        while (lo < hi) {

            int mid = lo + (hi - lo) / 2;

            // make mid even
            if (mid % 2 == 1) {
                mid--;
            }

            if (nums[mid] == nums[mid + 1]) {
                lo = mid + 2;
            } else {
                hi = mid;
            }
        }

        return nums[lo];
    }

    public static void main(String[] args) {

        int[] nums1 = {1,1,2,3,3,4,4,8,8};
        int[] nums2 = {3,3,7,7,10,11,11};

        System.out.println("Single element (Test 1): " + singleNonDuplicate(nums1));
        System.out.println("Single element (Test 2): " + singleNonDuplicate(nums2));
    }
} 