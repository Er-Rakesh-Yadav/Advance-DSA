package que03;

import java.util.Scanner;

class Solution {
    public static int minimumWithdrawal(int[] ATM, int X) {
        return 0;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N;
        N = scan.nextInt();
        int[] ATM = new int[N];
        for (int j = 0; j < N; j++) {
            ATM[j] = scan.nextInt();
        }
        int X;
        X = scan.nextInt();
        int result;
        result = minimumWithdrawal(ATM, X);
        System.out.print(result);
        return;
    }
}