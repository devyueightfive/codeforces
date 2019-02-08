package globalround;

import java.util.Scanner;

public class A2 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt(), k = sc.nextInt();
        boolean evenBase = (base % 2 == 0);
        int[] digits = new int[k];
        int sum = 0;
        for (int i = 0; i < k; i++) {
            digits[i] = sc.nextInt();
            if (!evenBase) sum += digits[i];
        }
        boolean even = false;
        if (evenBase) {
            if (digits[k - 1] % 2 == 0) even = true;
        } else if (sum % 2 == 0) even = true;
        System.out.println(even ? "even" : "odd");
    }


}
