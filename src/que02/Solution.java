package que02;

import java.util.Scanner;

class Solution {
    public static int beautifulFunction(int N) {
        N = N + 1;
        if (N < 9)
            N = 9;
        while (N % 10 == 0) {
            N = N / 10;
        }
        return N;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N;
        N = scan.nextInt();
        int result;
        result = beautifulFunction(N);
        System.out.print(result);
        return;
    }
}