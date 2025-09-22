public class BinarySearch1 {
    public static int findTarget(int arr[], int target) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Case 1: Found target
            if (arr[mid] == target) {
                return mid;
            }

            // Case 2: Left half is sorted
            if (arr[left] <= arr[mid]) {
                if (arr[left] <= target && target < arr[mid]) {
                    right = mid - 1; // search left
                } else {
                    left = mid + 1;  // search right
                }
            }
            // Case 3: Right half is sorted
            else {
                if (arr[mid] < target && target <= arr[right]) {
                    left = mid + 1;  // search right
                } else {
                    right = mid - 1; // search left
                }
            }
        }

        return -1; // not found
    }

    public static void main(String[] args) {
        int arr[] = {4, 5, 6, 7, 0, 1, 2};

        int target1 = 0; // should return 4
        int target2 = 3; // should return -1
        int target3 = 1; // should return 5

        System.out.println("Result 1: " + findTarget(arr, target1));
        System.out.println("Result 2: " + findTarget(arr, target2));
        System.out.println("Result 3: " + findTarget(arr, target3));
    }
}
