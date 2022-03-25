import java.util.ArrayList;
public class lecture {
    public static void main(String[] args) {
        // int[][] arr2d ={{ 0, 0, 0, 0, 0, 0, 1 },
        //                 { 1, 0, 1, 0, 1, 1, 0 },
        //                 { 1, 0, 0, 0, 0, 0, 0 },
        //                 { 0, 0, 1, 0, 0, 0, 0 },
        //                 { 0, 0, 0, 0, 0, 0, 0 },
        //                 { 0, 0, 0, 0, 1, 0, 1 }, 
        //                 { 0, 0, 0, 0, 0, 0, 0 } };
        // exitPoint(arr2d);
        // String str = "AbcDeRjJkKi";
        // System.out.println(toggleCases(str));
        // ArrayList<Integer> arr = new ArrayList<>();
        // arr.add(2);
        // arr.add(5);
        // arr.add(6);
        // arr.add(8);
        // arr.add(9);
        // arr.add(11);
        // arr.add(5);
        // arr.add(3);
        // arr.add(12);
        // arr.add(15);
        // removePrimeNumbers(arr);
        // String str = "abdgca";
        // System.out.println(findDifferenceInCharaters(str));
        // for (int i = 0; i < arr.size(); i++) {
        //     System.out.print(arr.get(i) + ", ");
        // }

        String str = "aaaaabbbccceedeeeee";
        System.out.println( stringCompression01(str) );
        System.out.println( stringCompression02(str) );
    }

    public static String stringCompression02(String str) {
        StringBuilder ans = new StringBuilder();

        ans.append(str.charAt(0));
        int count = 1;
        for (int i = 1; i < str.length(); i++) {
            char current = str.charAt(i);
            char previous = str.charAt(i - 1);

            if ( current == previous ) {
                count++;
            } else {
                if ( count > 1 ) {
                    ans.append(count);
                    count = 1;
                }
                ans.append(current);
            }
        }
        if ( count > 1 ) {
            ans.append(count);
        }

        return ans.toString();
    }

    public static String stringCompression01(String str) {
        String s = str.charAt(0) + "";
        for (int i = 1; i < str.length(); i++) {
            char current = str.charAt(i);
            char previous = str.charAt(i - 1);
            
            if (current != previous)
                s += current;
        }
        return s;
    }

    public static String findDifferenceInCharaters(String str) {
        StringBuilder ans = new StringBuilder();
        ans.append(str.charAt(0));
        for (int i = 1; i < str.length() ; i++) {
            char current = str.charAt(i);
            char previous = str.charAt(i - 1);
            int gap = current - previous;

            ans.append(gap);
            ans.append(current);
        }
        return ans.toString();
    }

    public static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void removePrimeNumbers(ArrayList<Integer> arr) {
        for (int i = arr.size() - 1; i >= 0; i--) {
            if (isPrime(arr.get(i))) {
                arr.remove(i);
            }
        }
    }

    public static String toggleCases(String str) {
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if ( ch >= 'a' && ch <= 'z' ) {
                char c = (char)(ch + 'A' - 'a');
                ans.append(c);
            } else if ( ch >= 'A' && ch <= 'Z' ) {
                char c = (char)(ch - 'A' + 'a');
                ans.append(c);
            }
        }
        return ans.toString();
    }

    public static void exitPoint(int[][] arr) {
        int row = 0, col = 0;
        int dir = 0;
        while ( true ) {
            dir = (dir + arr[row][col]) % 4;
            if ( dir == 0 ) {
                col++;
                if (col == arr[0].length) {
                    System.out.print(row + ", " + (col - 1));
                    break;
                }
            } else if ( dir == 1 ) {
                row++;
                if (row == arr.length) {
                    System.out.print((row - 1) + ", " + col);
                    break;
                }
            } else if ( dir == 2 ) {
                col--;
                if (col == -1) {
                    System.out.print(row + ", " + col + 1);
                    break;
                }
            } else if ( dir == 3 ) {
                row--;
                if (row == -1) {
                    System.out.print((row + 1) + ", " + col);
                    break;
                }
            }
        }
    }
}
