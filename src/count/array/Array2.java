package count.array;

import java.util.Arrays;

public class Array2 {
//    import java.util.*;

    class Solution {
        public long solution(long n) {
            // n의 각 자릿수를 큰 것부터 작은 순으로 정렬한 새로운 정수를 리턴
            long answer = 0;
            char[] result = Long.toString(n).toCharArray();
            Arrays.sort(result);

            for (int i = result.length - 1; i >= 0; i--) { //배열을 정렬한 후에 역순으로 변환 for문
                answer = answer * 10 + (result[i] - '0');
            }

            // for (char digit : result) { // 그냥 배열을 정렬 for문
            //     answer = answer * 10 + (digit - '0');
            // }

            return answer;
        }
    }
    class Solution2 {
        public long solution2(long n) {
            String[] list = String.valueOf(n).split("");
            Arrays.sort(list);

            StringBuilder sb = new StringBuilder();
            for (String aList : list) sb.append(aList);

            return Long.parseLong(sb.reverse().toString());
        }
    }

}
