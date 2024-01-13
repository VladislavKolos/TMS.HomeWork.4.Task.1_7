package task6;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array length: ");
        int length = scanner.nextInt();
        if (length <= 0) {
            System.out.println("re-Enter ");
        } else {
            int[] array = new int[length];
            System.out.println("Enter array elements: ");
            for (int i = 0; i < array.length; i++) {
                array[i] = scanner.nextInt();
            }

            boolean var = true;
            for (int i = 1; i < array.length; i++) {
                if (array[i - 1] >= array[i]) {
                    var = false;
                    break;
                }
            }
            if (var) {
                System.out.println("TRUE ");
            } else {
                System.out.println("FALSE");
            }
        }
    }
}
