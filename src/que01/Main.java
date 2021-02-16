package que01;

import java.util.Scanner;

class Main {
    public static int minimum_pluses(String A) {
        int num = A.indexOf('=');
        int length = A.length();
        int n = Integer.parseInt(A.substring(0, num));
        int last = Integer.parseInt(A.substring(num + 1, length));

        int rem = n % 10;
        int ses = n / 10;
        int sum = rem + ses;
        if (sum == last) {
            return 1;
        }
        return -1;

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String A;
        A = scan.next();
        int result;
        result = minimum_pluses(A);
        System.out.print(result);
        return;
    }
}