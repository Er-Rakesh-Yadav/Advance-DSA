
/*
@ LeetCode Problem No. - 13. Roman to Integer
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RomanNumber {


    public static int romanToInt(String s){
        Map<Character, Integer> ht = new HashMap();
        ht.put('I',1);
        ht.put('V',5);
        ht.put('X',10);
        ht.put('L',50);
        ht.put('C',100);
        ht.put('D',500);
        ht.put('M',1000);
        int roman_num = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i > 0 && ht.get(s.charAt(i)) > ht.get(s.charAt(i-1))) {
                roman_num += ht.get(s.charAt(i)) - 2 * ht.get(s.charAt(i - 1));

            }
            else {

                roman_num += ht.get(s.charAt(i));
            }
        }

        return roman_num;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        int num = romanToInt(str);
        System.out.println(num);
    }
}
