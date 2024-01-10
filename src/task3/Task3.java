package task3;

import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array length: ");
        int length = scanner.nextInt();
        if (length <= 0) {
            System.out.println("re-Enter ");
        } else {
            int array[] = new int[length];
            for (int i = 0; i < array.length; i++) {
                array[i] = (int) (Math.random() * 100);
            }
            System.out.println(Arrays.toString(array));

            int iMax = 0;
            int iMin = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] > array[iMax]) {
                    iMax = i;
                } else if (array[i] < array[iMin]) {
                    iMin = i;
                }
            }
            System.out.println("Max element index: " + iMax);
            System.out.println("Min element index: " + iMin);
        }
        scanner.close();
    }
}