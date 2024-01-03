package count;

import java.util.ArrayList;

public class Array {
    class Solution {
        public int[] solution(long n) {
            String number = Long.toString(n);
            int length = number.length();
            int[] answer = new int[length];
            for (int i=0; i<length; i++){
                answer[i] = Character.getNumericValue(number.charAt(length - 1 - i));
            }


            return answer;
        }
    }

    class Solution2 {
        public int[] solution(long n) {
            String num = Long.toString(n);
            int length = num.length();
            int[] answer = new int[length];

            for (int i = 0; i < length; i++) {
                answer[i] = num.charAt(length - 1 - i) - '0';
            }

            return answer;
        }
    }

    class Solution3 {
        public int[] solution(long n) {
            return new StringBuilder().append(n).reverse().chars().map(Character::getNumericValue).toArray();
        }
    }
}
