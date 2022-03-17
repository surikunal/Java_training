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

        int n = 9;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ( (i == j) || (i + j == n - 1) )
                    System.out.print("*\t");
                else
                    System.out.print("\t");
            }
            System.out.println();
        }







    }
}
