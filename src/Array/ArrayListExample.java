import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        // Create an ArrayList of integers
        ArrayList<Integer> numbers = new ArrayList<>();
 
        // Add elements to the ArrayList
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40); 

        // Access elements in the ArrayList
        int firstNumber = numbers.get(0); // Access the element at index 0
        System.out.println("First number: " + firstNumber);

        // Modify an element in the ArrayList
        numbers.set(1, 25); // Change the element at index 1 to 25

        // Remove an element from the ArrayList
        numbers.remove(2); // Remove the element at index 2

        // Iterate through the ArrayList
        for (int num : numbers) {
            System.out.println(num);
        }

        // Check if the ArrayList contains a specific element
        boolean contains30 = numbers.contains(30);
        System.out.println("Contains 30? " + contains30);

        // Get the size of the ArrayList
        int size = numbers.size();
        System.out.println("ArrayList size: " + size);
    }
}
