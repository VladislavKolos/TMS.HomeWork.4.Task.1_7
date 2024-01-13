package task7;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array length: ");
        int length = scanner.nextInt();
        if (length <= 0) {
            System.out.println("re-Enter ");
        } else if (length == 1) {
            int[] array = new int[length];
            System.out.println("Enter array elements: ");
            for (int i = 0; i < array.length; i++) {
                array[i] = scanner.nextInt();
                if (array[i] < 0) {
                    System.out.println("re-Enter and enter a positive number: ");
                    break;
                }
            }
        } else {
            int[] array = new int[length];
            System.out.println("Enter array elements: ");
            for (int i = 0; i < array.length; i++) {
                array[i] = scanner.nextInt();
                if (array[i] < 0) {
                    System.out.println("re-Enter and enter a positive number: ");
                    break;
                }
            }
            if (array[0] == 0) {
                System.out.println("re-Enter! The first index must not contain the value 0 ");
            }
        }
    }
}


