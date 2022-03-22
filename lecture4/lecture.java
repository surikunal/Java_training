import java.util.*;
class lecture {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int n = scn.nextInt();  //input size of array
        int[] arr = new int[n];
        System.out.println("Enter values of array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int target = scn.nextInt();
        int ans = search(arr, target);
        System.out.println(ans);
        // =============================================
        // int[] ans = inverseOfArray(arr, n);   // calling a function
        // for (int i = 0; i < n; i++) {
        //     System.out.println(ans[i]);
        // }
    }
    public static int[] inverseOfArray(int[] arr, int n) {
        int[] answer = new int[n];
        for (int i = 0; i < n; i++) {
            int val = arr[i];
            answer[val] = i;
        }
        return answer;
    }

    // rotate an array by k  =============================================
    public void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
    
    public void reverse(int[] arr, int si, int ei) {
        while (si < ei) {
            swap(arr, si, ei);
            si++;
            ei--;
        }
    }
    
    public void rotate(int[] arr, int k) {
        // 3 steps
        int n = arr.length;
        // to handle negetive cases
        if (k < 0)
            k = k + n;
        
        // to handle long cases
        k = k % n;
        
        // 1 -> reverse array by k size from last
        reverse(arr, n - k, n - 1);  // method and functions
        // 2 -> reverse the remaining array
        reverse(arr, 0, n - k - 1);
        // 3 -> reverse the whole array
        reverse(arr, 0, n - 1);
    }


    // binary search ===============================================
    public static int search(int[] arr, int target) {
        int n = arr.length;
        int i = 0, j = n - 1;
        while ( i <= j ) {
            int mid = (i + j) / 2;
            if ( arr[mid] == target ) {
                return mid;
            } else if ( arr[mid] < target ) {
                i = mid + 1;
            } else if ( arr[mid] > target ) {
                j = mid - 1;
            }
        }
        return -1;
    }
}