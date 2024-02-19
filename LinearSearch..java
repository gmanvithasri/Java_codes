public class LinearSearch {

    // Method to perform linear search
    public static int linearSearch(int[] arr, int elementToFind) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == elementToFind) {
                return i; // Element found, return its index
            }
        }
        return -1; // Element not found, return -1
    }

    public static void main(String[] args) {
        int[] arr = {3, 45, 1, 2, 34, 8}; // Sample array
        int searchElement = 34; // Element to search for

        int resultIndex = linearSearch(arr, searchElement);

        if (resultIndex == -1) {
            System.out.println("Element " + searchElement + " not found in the array.");
        } else {
            System.out.println("Element " + searchElement + " found at index: " + resultIndex);
        }
    }
}
