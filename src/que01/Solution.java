package que01;

import java.util.Scanner;

class Solution {
    public static int minimum_pluses(String A) {
        String[] str = A.split("=");
        try {
            int LSideNum = Integer.valueOf(str[0]);
            int RSideNum = Integer.valueOf(str[1]);
            int temp = LSideNum % 10;
            LSideNum = LSideNum / 10;
            int Result = LSideNum + temp;
            if (Result == RSideNum)
                return 1;
            else
                return -1;
        } catch (Exception e) {
            System.out.println("Please make sure that you have entered String without space");
            System.out.println(e);
            return 0;
        }
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