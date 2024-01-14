package task7;

import java.util.Arrays;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array length: ");
        int length = scanner.nextInt();
        if (length <= 0) {
            System.out.println("Invalid value! re-Enter ");
        } else if (length == 1) {
            int[] array = new int[length];
            int number = 0;
            int newNumber;
            System.out.println("Enter array elements: ");
            for (int i = 0; i < array.length; i++) {
                array[i] = scanner.nextInt();
                if (array[i] < 0) {
                    System.out.println("re-Enter and enter a positive number ");
                    break;
                } else {
                    number += (int) Math.pow(10, 0) * array[i];
                    newNumber = number + 1;
                    String stringOfNumbers = Integer.toString(newNumber);
                    char[] intermediateArray = stringOfNumbers.toCharArray();
                    int[] newArray = new int[intermediateArray.length];
                    for (int j = 0; j < intermediateArray.length; j++) {
                        newArray[j] = Character.getNumericValue(intermediateArray[j]);
                    }
                    System.out.println(Arrays.toString(newArray));
                }
            }
        } else {
            int[] array = new int[length];
            int number = 0;
            int newNumber;
            boolean var = true;
            System.out.println("Enter array elements: ");
            for (int i = 0; i < array.length; i++) {
                array[i] = scanner.nextInt();
                if (array[0] == 0 || array[i] < 0) {
                    var = false;
                    break;
                }
                number += (int) Math.pow(10, array.length - i - 1) * array[i];
            }
            if (var) {
                newNumber = number + 1;
                String stringOfNumbers = Integer.toString(newNumber);
                char[] intermediateArray = stringOfNumbers.toCharArray();
                int[] newArray = new int[intermediateArray.length];
                for (int i = 0; i < intermediateArray.length; i++) {
                    newArray[i] = Character.getNumericValue(intermediateArray[i]);
                }
                System.out.println(Arrays.toString(newArray));
            } else {
                System.out.println("re-Enter and enter positive elements that more than 0 ");
            }
        }
        scanner.close();
    }
}



