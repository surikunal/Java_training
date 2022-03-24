import java.util.Scanner;

public class lecture {
    public static void main(String[] args) {
        // Scanner scn = new Scanner(System.in);
        // System.out.println("Enter length of 1st 2d array : ");
        // int n1 = scn.nextInt(); // input size of array
        // System.out.println("Enter breadth of 1st 2d array : ");
        // int m1 = scn.nextInt();
        // int[][] arr1 = new int[n1][m1];
        // System.out.println("Enter values of 1st array : ");
        // for (int i = 0; i < n1; i++) {
        // for (int j = 0; j < m1; j++) {
        // arr1[i][j] = scn.nextInt();
        // }
        // }
        // System.out.println("Enter length of 2nd 2d array : ");
        // int n2 = scn.nextInt(); // input size of array
        // System.out.println("Enter breadth of 2nd 2d array : ");
        // int m2 = scn.nextInt();
        // int[][] arr2 = new int[n2][m2];
        // System.out.println("Enter values of 2nd array : ");
        // for (int i = 0; i < n2; i++) {
        // for (int j = 0; j < m2; j++) {
        // arr2[i][j] = scn.nextInt();
        // }
        // }
        // main logic
        // add2Matrices(arr1, n1, m1, arr2, n2, m2);
        // multiply2Matrices(arr1, n1, m1, arr2, n2, m2);
        int[][] arr2d = { { 1, 2, 3, 4, 5 },
                { 6, 7, 8, 9, 10 },
                { 11, 12, 13, 14, 15 },
                { 16, 17, 18, 19, 20 },
                { 21, 22, 23, 24, 25 } };
        // diagonalTraversal(arr2d);
        // transpose(arr2d);
        rotate90(arr2d);
        display(arr2d);
    }

    public static void rotate90(int[][] arr) {
        // 2 steps
        transpose(arr);
        swapColoumns(arr);
    }

    public static void swapColoumns(int[][] arr) {
        for (int j = 0; j < arr[0].length / 2; j++) {
            for (int i = 0; i < arr.length; i++) {
                // swap( arr[i][j], arr[i][arr[0].length - 1 - j] );
                int temp = arr[i][j];
                arr[i][j] = arr[i][arr[0].length - 1 - j];
                arr[i][arr[0].length - 1 - j] = temp;
            }
        }
    }

    public static void transpose(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr[0].length; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }

    public static void diagonalTraversal(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;
        for (int gap = 0; gap < m; gap++) {
            for (int i = 0, j = gap; j < m && i < n; i++, j++) {
                System.out.print(arr[i][j] + " ");
            }
        }
    }

    public static void display(int[][] arr) {
        // for (int[] ar : arr) {
        //     for (int i : ar) {
        //         System.out.print(i + " ");
        //     }
        //     System.out.println();
        // }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print( arr[i][j] + " " );
            }
            System.out.println();
        }
    }

    public static void multiply2Matrices(int[][] arr1, int n1, int m1, int[][] arr2, int n2, int m2) {
        if (m1 == n2) {
            int[][] ans = new int[n1][m2];
            for (int i = 0; i < n1; i++) {
                for (int j = 0; j < m2; j++) {

                    for (int k = 0; k < m1; k++) {
                        ans[i][j] += arr1[i][k] * arr2[k][j];
                    }

                }
            }
            display(ans);
        } else {
            System.out.println("Matrices cannot be miltiplied");
        }
    }

    public static void add2Matrices(int[][] arr1, int n1, int m1, int[][] arr2, int n2, int m2) {
        if (n1 == n2 && m1 == m2) {

            int[][] ans = new int[n1][m1];

            for (int i = 0; i < n1; i++) {
                for (int j = 0; j < m1; j++) {
                    ans[i][j] = arr1[i][j] + arr2[i][j];
                }
            }

        } else {
            System.out.println("cannot add these matrices");
        }
    }
}
