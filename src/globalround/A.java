package globalround;

import java.lang.*;
import java.util.*;

public class A {


    public static void main(String[] args) {
        a();
    }

    private static void a() {
        //parse input
        Scanner sc = new Scanner(System.in);
        long base = sc.nextInt();
        long k = sc.nextInt();
        //System.out.println("base = " + base + " k = " + k);
        // Gather a(k) to the list
        LinkedList<Integer> digits = new LinkedList<>();
        while (sc.hasNextInt()) {
            digits.add(sc.nextInt());
            //System.out.println(digits.getLast());
            if (digits.size() == k) break;
        }
        String answer = "odd";
        //The number will be 'even' if:
        // First case: base is even
        // then last addition in SUM[a(k)*base^(k-1)] must be 'even'
        // Second case: base is odd
        // Sum of a(k) must be 'even'

        // Base is even
        if (base % 2 == 0) {
            if (digits.getLast() % 2 == 0) answer = "even";
        }
        // Base is odd
        else {
            long sum = 0;
            for (Integer item : digits) {
                sum += item;
            }
            if (sum % 2 == 0) answer = "even";
        }
        System.out.println(answer);
        sc.close();
    }
}
