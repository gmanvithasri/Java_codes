public class TernarySearch {

    // Ternary Search function for a sorted array
    public static int ternarySearch(int[] arr, int left, int right, int target) {
        if (right >= left) {
            // Divide the range into three parts
            int mid1 = left + (right - left) / 3;
            int mid2 = right - (right - left) / 3;

            // Check if the target is at mid1 or mid2
            if (arr[mid1] == target) {
                return mid1;
            }
            if (arr[mid2] == target) {
                return mid2;
            }

            // Narrow the search range
            if (target < arr[mid1]) {
                return ternarySearch(arr, left, mid1 - 1, target);
            } else if (target > arr[mid2]) {
                return ternarySearch(arr, mid2 + 1, right, target);
            } else {
                return ternarySearch(arr, mid1 + 1, mid2 - 1, target);
            }
        }

        // Target not found
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        int target = 7;

        System.out.println("Array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }

        System.out.println("\n\nTarget: " + target);

        int index = ternarySearch(array, 0, array.length - 1, target);

        if (index != -1) {
            System.out.println("\nTarget found at index: " + index);
        } else {
            System.out.println("\nTarget not found in the array.");
        }
    }
}
