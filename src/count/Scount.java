package count;

public class Scount {
    // s 문자열안에 특정 문자 개수 비교 ture || false
    // 대소문자 구별 x
    // 기본 반환값 true
    // 개수 같으면 t 다르면 f
    class Solution {
        boolean solution(String s) {
         boolean answer = true;
         String p = "p";
         String y = "y";
         int pcount = 0;
         int ycount = 0;

         for (int i = 0; i < s.length(); i++) {
             if (String.valueOf(s.charAt(i)).equalsIgnoreCase(p)) {
                 pcount++;
             }
         }

         for (int i = 0; i < s.length(); i++) {
             if (String.valueOf(s.charAt(i)).equalsIgnoreCase(y)) {
                 ycount++;
             }
         }

         if (pcount != ycount) {
             answer = false;
         }

         return answer;

//         s = s.toLowerCase(); // 모든 문자를 소문자로 변환
//         s = s.toUpperCase(); // 모든 문자를 대문자로 변환
//         return s.chars().filter(ch -> ch =='p').count() == s.chars().filter(ch -> ch =='y').count();

        }
    }
    class Solution2 {
        public long[] solution(int x, int n) {
            // x에서 x씩 증가하는 숫자를 n개 지니는 리스트 반환
            long[] answer = new long[n];
            for (int i = 0; i < n; i++) {
                answer[i] = (long) x * (i + 1);
            }
            return answer;
        }
    }
}
