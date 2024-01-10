package task4;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array length: ");
        int length = scanner.nextInt();
        if (length <= 0) {
            System.out.println("re-Enter ");
        } else {
            int array[] = new int[length];
            System.out.println("Enter array elements: ");
            for (int i = 0; i < array.length; i++) {
                array[i] = scanner.nextInt();
            }

            int z = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] == 0) {
                    z++;
                }
            }
            if (z > 0) {
                System.out.println("Quantity: " + z);
            } else {
                System.out.println("No null elements ");
            }
        }
        scanner.close();
    }
}
