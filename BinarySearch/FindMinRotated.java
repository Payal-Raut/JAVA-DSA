public class FindMinRotated {

    public static int findMin(int[] nums) {

        int lo = 0, hi = nums.length - 1;

        while (lo < hi) {

            int mid = lo + (hi - lo) / 2;

            if (nums[mid] > nums[hi]) {
                lo = mid + 1;
            } else {
                hi = mid;
            }
        }

        return nums[lo];
    }

    public static void main(String[] args) {

        int[] nums1 = {3,4,5,1,2};
        int[] nums2 = {4,5,6,7,0,1,2};
        int[] nums3 = {11,13,15,17};

        System.out.println(findMin(nums1)); // 1
        System.out.println(findMin(nums2)); // 0
        System.out.println(findMin(nums3)); // 11
    }
}