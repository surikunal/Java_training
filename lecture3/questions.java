package lecture3;

import java.util.Scanner;

public class questions {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        // step 1
        int n = scn.nextInt();  // 5
        // int[] arr = new int[n];
        // step 2
        int[] arr;  // initialization
        arr = new int[n];   // declaration
        System.out.println("Enter values of array :");
        // step 3
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        // spanOfAnArray(arr, n);
        // findTarget(arr, n, 6);
        int[] answer = reverseOfAnArray(arr, n);
        for (int i = 0; i < n; i++) {
            System.out.print(answer[i] + ", ");
        }
    }

    public static int[] reverseOfAnArray(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            int startIndex = i;
            int endIndex = n - 1 - i;

            int temp = arr[startIndex];
            arr[startIndex] = arr[endIndex];
            arr[endIndex] = temp;
        }
        return arr;
    }

    public static void spanOfAnArray( int[] arr, int n ) {
        int minimum = Integer.MAX_VALUE;
        // System.out.println(minimum);
        int maximum = Integer.MIN_VALUE;
        // System.out.println(maximum);
        for (int i = 0; i < n; i++) {
            int val = arr[i];
            if ( val >= maximum ) {
                maximum = val;
            }
            if (val <= minimum) {
                minimum = val;
            }
        }
        System.out.println("mini val : " + minimum);
        System.out.println("maxi val : " + maximum);
        int ans = maximum - minimum;
        System.out.println("ans is : " + ans);
    }
    public static void findTarget(int[] arr, int n, int target) {
        for (int i = 0; i < n; i++) {
            if ( arr[i] == target ) {
                System.out.println("Index of target is : " + i);
                break;  // used to terminate loop
            }
        }
        return; // used to terminate function
    }
}
