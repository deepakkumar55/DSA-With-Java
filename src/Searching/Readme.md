## Search Algorithms:

Search algorithms are techniques used to find a specific element within a data structure, such as an array or a list. There are two main categories of search algorithms: linear search and binary search.

### Linear Search:
Linear search is a simple method where each element in the data structure is sequentially checked until the desired element is found or the entire structure has been traversed.

### Binary Search:
Binary search is a more efficient approach for searching in sorted data structures like arrays. It works by repeatedly dividing the search range in half and comparing the target element with the middle element. If the target is smaller, the search continues in the left half; if larger, the search continues in the right half.

## Java Code Examples:

Here are code examples for both linear search and binary search in Java:

### Linear Search:

```java
public class LinearSearch {
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Element found at index i
            }
        }
        return -1; // Element not found
    }

    public static void main(String[] args) {
        int[] arr = { 2, 5, 8, 12, 16, 23, 38, 45, 56, 72 };
        int target = 23;
        int index = linearSearch(arr, target);
        if (index != -1) {
            System.out.println("Element found at index " + index);
        } else {
            System.out.println("Element not found");
        }
    }
}
```

### Binary Search:

```java
public class BinarySearch {
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return mid; // Element found at index mid
            } else if (arr[mid] < target) {
                left = mid + 1; // Search in the right half
            } else {
                right = mid - 1; // Search in the left half
            }
        }
        return -1; // Element not found
    }

    public static void main(String[] args) {
        int[] arr = { 2, 5, 8, 12, 16, 23, 38, 45, 56, 72 };
        int target = 23;
        int index = binarySearch(arr, target);
        if (index != -1) {
            System.out.println("Element found at index " + index);
        } else {
            System.out.println("Element not found");
        }
    }
}
```

## Questions:

1. Explain the difference between linear search and binary search.
2. Why is binary search more efficient than linear search for large sorted arrays?
3. What is the time complexity of binary search? Is it always applicable?
4. When would you prefer to use linear search over binary search?
5. Modify the binary search code to handle cases where the target element may appear multiple times in the array. How would you do that?

## Answer

1. **Difference between Linear Search and Binary Search:**
   - **Linear Search:** In linear search, you sequentially check each element in the data structure until the target element is found or the entire structure is traversed. It's simple and works on both sorted and unsorted arrays. However, its time complexity is O(n), where n is the number of elements.
   - **Binary Search:** Binary search works only on sorted arrays. It repeatedly divides the search range in half by comparing the target with the middle element. If the target is smaller, the search continues in the left half; if larger, in the right half. This process significantly reduces the search space with each step. Binary search has a time complexity of O(log n), which is much more efficient for large arrays.

2. **Efficiency of Binary Search:**
   - Binary search is more efficient than linear search for large sorted arrays because it reduces the search space by half with each comparison. This logarithmic reduction leads to a much faster search process, especially as the size of the array increases. In contrast, linear search checks each element one by one, resulting in a linear time complexity, which can be slow for large arrays.

3. **Time Complexity and Applicability of Binary Search:**
   - The time complexity of binary search is O(log n), where n is the number of elements in the array. It's important to note that this logarithmic behavior is applicable when the search space is halved in each step. Binary search is not applicable for unsorted arrays, and its efficiency is impacted when dealing with data structures that don't support random access (like linked lists).

4. **When to Prefer Linear Search over Binary Search:**
   - Linear search should be preferred in the following scenarios:
     - The array is small and not sorted.
     - The array is sorted, but the cost of sorting is higher than the benefits of binary search.
     - The target element's position needs to be known in case of duplicates.

5. **Modified Binary Search for Duplicates:**
   To handle cases where the target element appears multiple times in the array, you can modify the binary search to find the first and last occurrences of the target. Here's a modified version of the binary search code to achieve this:

```java
public class ModifiedBinarySearch {
    public static int findFirstOccurrence(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                result = mid;
                right = mid - 1; // Continue searching in the left half
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return result;
    }

    public static int findLastOccurrence(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                result = mid;
                left = mid + 1; // Continue searching in the right half
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 5, 8, 12, 16, 23, 23, 23, 38, 45, 56, 72 };
        int target = 23;
        int firstIndex = findFirstOccurrence(arr, target);
        int lastIndex = findLastOccurrence(arr, target);

        if (firstIndex != -1 && lastIndex != -1) {
            System.out.println("First occurrence at index: " + firstIndex);
            System.out.println("Last occurrence at index: " + lastIndex);
        } else {
            System.out.println("Element not found");
        }
    }
}
```
