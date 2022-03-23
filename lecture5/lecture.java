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
        count012(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    public static void count012(int[] arr) {
        int ptr1 = 0, itr = 0, ptr2 = arr.length - 1;
        while ( itr <= ptr2 ) {
            if ( arr[itr] == 0 ) {
                swap( arr, itr, ptr1 );
                ptr1++;
                itr++;
            } else if ( arr[itr] == 2 ) {
                swap( arr, itr, ptr2 );
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
