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
        // step 4
        // main logic
        // finding span of an array
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
}
