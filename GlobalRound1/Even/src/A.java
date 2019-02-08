import java.lang.*;
import java.util.*;

public class A {


    public static void a() {
        //parse input
        Scanner sc = new Scanner(System.in);
        long base = sc.nextInt();
        long k = sc.nextInt();
        // to [] of digits
        LinkedList<Integer> digits = new LinkedList<>();
        while (sc.hasNext()) {
            digits.add(sc.nextInt());
        }

        // the result number
        long resultNumber = 0;
        //if (number == params2.length) {
        for (int i = 0; i < k; i++) {
            long digit = secondLine[i];
            resultNumber += digit * Math.pow(base, (k - i - 1));
        }
        //}
        String answer;
        answer = ((resultNumber % 2) == 0) ? "even" : "odd";
        System.out.println(answer);
    }

    public static void main(String[] args) {
        a();
    }
}
