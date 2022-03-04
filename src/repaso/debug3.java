package repaso;
import java.util.Scanner;
public class debug3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter numbers to sort");
        String str = in.nextLine();
        String[] splitted = str.trim().split("s+");
        int len = str.length();
        int a[] = new int[len];
        for (int i = 0; i < len; i++) {
            a[i] = Integer.parseInt(str.charAt(i)+"");
        }
        boolean TryAgain = true;
        System.out.println("How to sort: Type A for Ascending and B for Descendent order");
        while (TryAgain==true) {
            char SortType = in.next().charAt(0);
            if (SortType == 'A' || SortType == 'a' || SortType == 'B' || SortType == 'b')
            {// first if
                if (SortType == 'A' || SortType == 'a') {// second if loop
// code for sorting in Ascending order
                    for (int j = 0; j < len - 1; j++) {
                        for (int k = 0; k < len - j - 1; k++) {
                            if (a[k] > a[k + 1]) {
                                int n = a[k];
                                a[k] = a[k + 1];
                                a[k + 1] = n;
                            } // for
                        } // for
                    } // if
                    System.out.println("Numbers sorted in Ascending order:");
                    for (int m = 0; m < len; m++) {
                        System.out.print(a[m] + " ");
                    } // for
                    TryAgain = false;
                } // second if loop
                else {// second else
// code for sorting in Dscending order
                    for (int j = 0; j < len - 1; j++) {
                        for (int k = 0; k < len - j - 1; k++) {
                            if (a[k] < a[k + 1]) {
                                int n = a[k];
                                a[k] = a[k + 1];
                                a[k + 1] = n;
                            } // for
                        } // for
                    } // if
                    System.out.println("Numbers sorted in Dscending order:");
                    for (int m = 0; m < len; m++) {
                        System.out.print(a[m] + " ");
                    } // for
                    TryAgain = false;
                } // second else loop
            } // first if loop
            else {// first else
                TryAgain = true;
                System.out.println("Invalid input");
                System.out.println("Type A for Ascending and B for Descending order:");
            } // first else loop
        } // while loop
    }// main

}
