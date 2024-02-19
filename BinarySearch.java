public class BinarySearch {

    // Method to perform binary search
    public static int binarySearch(int[] arr, int elementToFind) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if elementToFind is present at mid
            if (arr[mid] == elementToFind)
                return mid;

            // If elementToFind greater, ignore left half
            if (arr[mid] < elementToFind)
                left = mid + 1;

            // If elementToFind is smaller, ignore right half
            else
                right = mid - 1;
        }

        // If we reach here, then the element was not present
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 10, 40}; // Sorted array
        int searchElement = 10; // Element to search for

        int resultIndex = binarySearch(arr, searchElement);

        if (resultIndex == -1)
            System.out.println("Element not found in the array.");
        else
            System.out.println("Element found at index: " + resultIndex);
    }
}
