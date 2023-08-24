public class target_element {
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Return the index of the target element if found
            }
        }
        return -1; // Return -1 if target element is not found
    }

    public static void main(String[] args) {
        int[] array = { 3, 9, 2, 7, 5, 1, 8 };
        int targetElement = 5;
        int result = linearSearch(array, targetElement);
        if (result != -1) {
            System.out.println("Element found at index " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}
