import java.lang.*;
import java.util.*;

public class B {

    private static long[] parseToLongArr(String input) {
        String[] strArr = input.split(" ");
        long[] result = new long[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            result[i] = Integer.parseInt(strArr[i]);
        }
        return result;
    }

    private static void B() {
        Scanner sc = new Scanner(System.in);
        int lines = 3;
        String[] params = new String[lines];
        for (int i = 0; i < lines; i++) {
            params[i] = sc.nextLine();
        }
        long number = Long.parseLong(params[0]);
        long[] grisha = parseToLongArr(params[1]);
        long[] andrey = parseToLongArr(params[2]);

    }


    public static void main(String[] args) {
        B();
    }
}
