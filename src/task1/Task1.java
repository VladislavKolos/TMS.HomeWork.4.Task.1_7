package task1;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array length: ");
        int length = scanner.nextInt();
        int array[] = new int[length];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        System.out.println(Arrays.toString(array));

        int var;
        int l = array.length;
        for (int i = 0; i < l / 2; i++) {
            var = array[l - i - 1];
            array[l - i - 1] = array[i];
            array[i] = var;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(" " + array[i]);
        }
        scanner.close();
    }
}
