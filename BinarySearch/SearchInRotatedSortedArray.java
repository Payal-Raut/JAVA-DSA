public class SearchInRotatedSortedArray {
    

    public static int search(int[] nums, int target) {

        int lo = 0, hi = nums.length - 1;

        while (lo <= hi) {

            int mid = lo + (hi - lo) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            // Left half sorted
            if (nums[lo] <= nums[mid]) {

                if (target >= nums[lo] && target < nums[mid]) {
                    hi = mid - 1;
                } else {
                    lo = mid + 1;
                }
            }
            // Right half sorted
            else {

                if (target > nums[mid] && target <= nums[hi]) {
                    lo = mid + 1;
                } else {
                    hi = mid - 1;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] nums = {4, 5, 6, 7, 0, 1, 2};

        int target1 = 0;
        int target2 = 3;

        int result1 = search(nums, target1);
        int result2 = search(nums, target2);

        System.out.println("Index of " + target1 + " = " + result1);
        System.out.println("Index of " + target2 + " = " + result2);
    }
}

