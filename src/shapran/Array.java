package shapran;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Array {
    private final Scanner sc = new Scanner(System.in);
    private final Random random = new Random();

    private int getLength() {
        int size = 0;
        System.out.println("Enter array >= 10");
        if (sc.hasNext()) {
            size = sc.nextInt();
        }
        sc.nextLine();
        return size >= 10 ? size : getLength();
    }

    public int[] createArray() {
        int[] arr = new int[getLength()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(-100, 100);
            System.out.print(arr[i] + " ");
        }
        return arr;
    }

    public void arraySort(int[] arr) {
        System.out.println("\n Sort array ascending or descending? Please enter 1 or 2");
        int answer = sc.nextInt();
        if (answer == 1) {
            bubbleSort(arr);
        } else if (answer == 2) {
            descendingSort(arr);
        } else {
            System.out.println("Wrong choice");
        }
    }

    private void bubbleSort(int[] arr) {
        boolean sorted = false;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < arr.length - 1; i++) {
                int firstNumber = arr[i];
                int secondNumbers = arr[i + 1];
                if (firstNumber > secondNumbers) {
                    int temp = firstNumber;
                    firstNumber = secondNumbers;
                    secondNumbers = temp;
                    sorted = false;
                }
                arr[i] = firstNumber;
                arr[i + 1] = secondNumbers;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    private void descendingSort(int[] arr) {
        boolean sorted = false;
        while (!sorted) {
            sorted = true;
            int temp;
            for (int i = 1; i < arr.length; ++i) {
                if (arr[i - 1] < arr[i]) {
                    sorted = false;
                    temp = arr[i - 1];
                    arr[i - 1] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public void raiseCube(int[] arr) {
        System.out.println("\n Cube every 3rd number");
        for (int i = 2; i < arr.length; i += 3) {
            arr[i] = arr[i] * arr[i] * arr[i];
        }
        System.out.println(Arrays.toString(arr));
    }
}

