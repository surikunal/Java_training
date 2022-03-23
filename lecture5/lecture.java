public class lecture {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter size of 1st array : ");
        int n = scn.nextInt();  //input size of array
        int[] arr1 = new int[n];
        System.out.println("Enter values of 1st array : ");
        for (int i = 0; i < n; i++) {
            arr1[i] = scn.nextInt();
        }
        System.out.println("Enter size of 2nd array : ");
        int m = scn.nextInt();  //input size of array
        int[] arr2 = new int[m];
        System.out.println("Enter values of 2nd array : ");
        for (int i = 0; i < m; i++) {
            arr2[i] = scn.nextInt();
        }

        // main logic
        // sumOf2Array(arr1, n, arr2, m);
        printAllSubarrays(arr);
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
        int size = (int)Math.max(n, m) + 1;
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
