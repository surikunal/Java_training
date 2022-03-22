package lecture2;
import java.util.Scanner;

public class lecture_2 {
    public static void main(String[] args) {
        
        // find age of a person
        // birthday, birthmonth, birthyear
        // currentday, currentmonth, currentyear
        
        Scanner scn = new Scanner(System.in);
        // int bd = scn.nextInt();
        // int bm = scn.nextInt();
        // int by = scn.nextInt();

        // int cd = scn.nextInt();
        // int cm = scn.nextInt();
        // int cy = scn.nextInt();

        // if ( cm < bm ) {
        //     cm = cm + 12;
        //     cy = cy - 1;
        // }
        
        // if ( cd < bd ) {
        //     cd = cd + 30;
        //     cm = cm - 1;
        // }

        // int y = cy - by;
        // int m = cm - bm;
        // int d = cd - bd;

        // System.out.println(d + "/" + m + "/" + y);
            
        // ========================================================

        // * * * * * 0, 5
        //   * * * * 1, 4
        //     * * * 2, 3
        //       * * 3, 2
        //         * 4, 1
        // int n = 5;
        // // no of rowes only
        // int nosp = 0; // no of spaces
        // int nos = n;    // no of stars
        // for ( int i = 0; i < n; i++ ) {
        //     // magic
        //     for ( int j = 0; j < nosp; j++ ) {
        //         System.out.print("\t");
        //     }
        //     for ( int j = 0; j < nos; j++ ) {
        //         System.out.print("*\t");
        //     }
        //     ++nosp;
        //     --nos;
        //     System.out.println();
        // }

        // ========================================
        // int n = 5;
        // // no of rowes only
        // int nosp = n - 1; // no of spaces
        // int nos = 1;    // no of stars
        // for ( int i = 0; i < n; i++ ) {
        //     // magic
        //     for ( int j = 0; j < nosp; j++ ) {
        //         System.out.print("\t");
        //     }
        //     for ( int j = 0; j < nos; j++ ) {
        //         System.out.print("*\t");
        //     }
        //     nosp--;
        //     nos++;
        //     System.out.println();
        // }

        // ========================================

        // int n = 9;
        // int nst = 1;
        // int nsp = n / 2;
        // for ( int i = 1; i <= n; i++ ) {
        //     for (int j = 1; j <= nsp; j++) {
        //         System.out.print("\t");
        //     }
        //     for (int j = 1; j <= nst; j++) {
        //         System.out.print("*\t");
        //     }
            
        //     if ( i <= n / 2 ) {
        //         nst = nst + 2;
        //         nsp = nsp - 1;
        //     } else {
        //         nst = nst - 2;
        //         nsp = nsp + 1;
        //     }
        //     System.out.println();
        // }

        // ========================================

        // diagonal pattern

        // int n = 5;
        // // rows
        // for (int i = 0; i < n; i++) {
        //     // coloumns
        //     for ( int j = 0; j < n; j++ ) {

        //         if ( i == j ) {
        //             System.out.print("*\t");
        //         } else {
        //             System.out.print("\t");
        //         }

        //     }
        //     System.out.println();
        // }

        // ==============================================

        // anti diagonal pattern

        // int n = 7;
        // // rows
        // for ( int i = 0; i < n; i++ ) {
        //     // column
        //     for (int j = 0; j < n; j++) {
        //         if (i + j == n - 1) {
        //             System.out.print("*\t");
        //         } else {
        //             System.out.print("\t");
        //         }
        //     }
        //     System.out.println();
        // }

        // ============================= cross pattern

        // int n = 9;
        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j < n; j++) {
        //         if ( (i == j) || (i + j == n - 1) )
        //             System.out.print("*\t");
        //         else
        //             System.out.print("\t");
        //     }
        //     System.out.println();
        // }

        // ===============================

        // int n = 7;
        // int count = 0;  // count the number of divisibles
        // for (int i = 1; i <= n; i++) {
        //     if (n % i == 0) {
        //         count++;
        //     }
        // }
        // if (count == 2) {
        //     System.out.println(true);
        // } else {
        //     System.out.println(false);
        // }

        // ======================================
        // fibonacci series
        // int n = 100;
        // int x = 0;
        // int y = 1;
        // for (int i = 0; i < n; i++) {
        //     System.out.print(x + " ");
        //     int z = x + y;
        //     x = y;
        //     y = z;
        // }

        // ===========================================================
        // int n = 21430;
        // // inverse of a number
        // int inv = 0;    // answer
        // int oldPower = 0;
        // while ( n != 0 ) {
            //     int oldDigit = n % 10;
            //     int newDigit = oldPower;
            //     int newPower = oldDigit;
            
            //     inv = inv + (int)Math.pow(10, newPower - 1);
            
            //     n = n / 10;
            //     oldPower++;
            // }
            // System.out.println(inv);
        // }
        // ===========================================================
            // Pythagoraus Triplet
        // int a = 4, b = 3, c = 5;
        // int max = 0;
        // if (a >= max) {
        //     max = a;
        // }
        // if (b >= max) {
        //     max = b;
        // }
        // if (c >= max) {
        //     max = c;
        // }

        // // max == 5
        // if ( max == a ) {
        //     if ( b * b + c * c == a * a ) 
        //         System.out.print(true);
        //     else 
        //         System.out.print(false);
        // } else if ( max == b ) {
        //     if ( a * a + c * c == b * b ) 
        //         System.out.print(true);
        //     else 
        //         System.out.print(false);
        // } else if ( max == c ) {
        //     if ( a * a + b * b == c * c ) 
        //         System.out.print(true);
        //     else 
        //         System.out.print(false);
        // }
        // ========================================
        // Prime Factorization
        // int n = 1440;
        // for (int div = 2; div < n; div++) {

        //     while ( n % div == 0 ) {
        //         n = n / div;
        //         System.out.print(div + ", ");
        //     }

        // }

        // =============================== bulbs
        int n = 100;
        for (int i = 1; i * i <= n ; i++) {
            System.out.print(i * i);    // 1, 4, 9, 16, 25, 36, .........
        }
    }
}
    