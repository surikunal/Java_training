import java.util.Scanner;

public class lecture {
    public static void main(String[] args) {
        // Scanner scn = new Scanner(System.in);
        // System.out.println("Enter size of 1st array : ");
        // int n = scn.nextInt(); //input size of array
        // int[] arr1 = new int[n];
        // System.out.println("Enter values of 1st array : ");
        // for (int i = 0; i < n; i++) {
        // arr1[i] = scn.nextInt();
        // }
        // System.out.println("Enter size of 2nd array : ");
        // int m = scn.nextInt(); //input size of array
        // int[] arr2 = new int[m];
        // System.out.println("Enter values of 2nd array : ");
        // for (int i = 0; i < m; i++) {
        // arr2[i] = scn.nextInt();
        // }

        // main logic
        // sumOf2Array(arr1, n, arr2, m);
        // printAllSubarrays(arr);
        // fistIndexLastIndex(arr);
        int[] arr = { 1, 0, 2, 2, 0, 1, 2, 2, 0, 1, 1, 1, 0, 0, 0, 0, 0, 1, 2 };
        // count01(arr);
        // for (int i : arr) {
        // System.out.print(i + " ");
        // }
        // count012(arr);
        // for (int i : arr) {
        // System.out.print(i + " ");
        // }
        int[][] arr2d = { { 1, 2, 3, 4, 5 }, 
                          { 6, 7, 8, 9, 10 }, 
                          { 11, 12, 13, 14, 15 }, 
                          { 16, 17, 18, 19, 20 },
                          { 21, 22, 23, 24, 25 } };
        // wave1(arr2d);
        // wave2(arr2d);
        sprial1(arr2d);
    }

    public static void sprial1(int[][] arr) {
        int minr = 0;
        int minc = 0;
        int maxr = arr.length - 1;
        int maxc = arr[0].length - 1;
        int count = 0;
        int total = arr.length * arr[0].length;
        while ( count < total ) {
            for (int col = minc; col <= maxc && count < total; col++) {
                System.out.print(arr[minr][col] + ", ");
                count++;
            }
            minr++;
            
            for (int row = minr; row <= maxr && count < total; row++) {
                System.out.print(arr[row][maxc] + ", ");
                count++;
            }
            maxc--;

            for (int col = maxc; col >= minc && count < total; col--) {
                System.out.print(arr[maxr][col] + ", ");
                count++;
            }
            maxr--;

            for (int row = maxr; row >= minr && count < total; row--) {
                System.out.print(arr[row][minc] + ", ");
                count++;
            }
            minc++;
        }
    }

    public static void wave2(int[][] arr) {
        // main logic
        for (int j = 0; j < arr[0].length; j++) {
            if (j % 2 == 0) {   // even index
                for (int i = 0; i < arr.length; i++) {
                    System.out.print(arr[i][j] + ", ");
                }
            } else if (j % 2 != 0) {    // odd index
                for (int i = arr.length - 1; i >= 0; i--) {
                    System.out.print(arr[i][j] + ", ");
                }
            }
        }
    }

    public static void wave1(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {   // even
                for (int j = 0; j < arr[0].length; j++) {
                    System.out.print(arr[i][j] + ", ");
                }
            } else {
                for (int j = arr[0].length - 1; j >= 0; j--) {
                    System.out.print(arr[i][j] + ", ");
                }
            }
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void count012(int[] arr) {
        int ptr1 = 0, itr = 0, ptr2 = arr.length - 1;
        while (itr <= ptr2) {
            if (arr[itr] == 0) {
                swap(arr, itr, ptr1);
                ptr1++;
                itr++;
            } else if (arr[itr] == 2) {
                swap(arr, itr, ptr2);
                ptr2--;
            } else {
                itr++;
            }
        }
    }

    public static void count01(int[] arr) {
        int i = 0, j = 0;
        while (j < arr.length) {
            if (arr[j] == 0) {

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                i++;
            }
            j++;
        }
    }

    public static void fistIndexLastIndex(int[] arr, int tar) {
        int i = 0, j = arr.length - 1;
        // first index
        while (i <= j) {
            int mid = (i + j) / 2;
            if (arr[mid] == tar) {

                if (mid - 1 >= 0 && arr[mid - 1] == arr[mid]) {
                    j = mid - 1;
                } else {
                    System.out.print(mid);
                }

            } else if (arr[mid] < tar) {
                i = mid + 1;
            } else if (arr[mid] > tar) {
                j = mid - 1;
            }
        }
        // last index
        while (i <= j) {
            int mid = (i + j) / 2;
            if (arr[mid] == tar) {

                if (mid + 1 < arr.length && arr[mid + 1] == arr[mid]) {
                    i = mid + 1;
                } else {
                    System.out.print(mid);
                }

            } else if (arr[mid] < tar) {
                i = mid + 1;
            } else if (arr[mid] > tar) {
                j = mid - 1;
            }
        }
    }

    public static void printAllSubarrays(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                // range
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
        }
    }

    public static void sumOf2Array(int[] arr1, int n, int[] arr2, int m) {
        int i = n - 1;
        int j = m - 1;
        int size = (int) Math.max(n, m) + 1;
        int[] ans = new int[size];
        int k = ans.length - 1;
        int carry = 0;
        while (k >= 0) {
            int sum = carry;
            if (i >= 0) {
                sum = sum + arr1[i];
            }
            if (j >= 0) {
                sum = sum + arr2[j];
            }

            carry = sum / 10;
            sum = sum % 10;

            ans[k] = sum;

            i--;
            j--;
            k--;
        }
        if (carry != 0) {
            ans[0] = carry;
        }
    }
}
