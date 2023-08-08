package Array;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDArrayExample {
    public static void main(String[] args) {
        // Declare and initialize a 2D array
        int[][] twoDArray = new int[3][4]; // 3 rows, 4 columns
        
        // Initialize the elements
        twoDArray[0][0] = 1;
        twoDArray[0][1] = 2;
        twoDArray[0][2] = 3;
        twoDArray[0][3] = 4;
        twoDArray[1][0] = 5;
        twoDArray[1][1] = 6;
        twoDArray[1][2] = 7;
        twoDArray[1][3] = 8;
        twoDArray[2][0] = 9;
        twoDArray[2][1] = 10;
        twoDArray[2][2] = 11;
        twoDArray[2][3] = 12;
        
        // Access elements of the 2D array
        int value = twoDArray[1][2]; // Accessing the element in the second row and third column
        System.out.println(value);
        // Print the elements of the 2D array
        for (int i = 0; i < twoDArray.length; i++) {
            for (int j = 0; j < twoDArray[i].length; j++) {
                System.out.print(twoDArray[i][j] + " ");
            }
            System.out.println(); // Move to the next row
        }
        // System.out.println(Arrays.toString(twoDArray[]));




        Scanner sc = new Scanner(System.in);
        int[][] TwoDArray =new int[5][4];
        for (int i = 0; i < TwoDArray.length; i++) {
            for (int j = 0; j < TwoDArray[i].length; j++) {
                TwoDArray[i][j]=sc.nextInt();
            }
        }
        for (int i = 0; i < TwoDArray.length; i++) {
            for (int j = 0; j < TwoDArray[i].length; j++) {
                
            }
            System.out.println(Arrays.toString(TwoDArray[i]));
        }
    }
}