package count.array;

public class Array_Find {
    class Solution {
        public String solution(String[] seoul) {
            // Kim의 seoul 배열의 인덱스 값을 찾아 위치 반환
            String answer = "";

            for (int i = 0; i < seoul.length; i++) {
                if (seoul[i].equals("Kim")) {
                    answer = "김서방은 " + i + "에 있다";
                    break;
                }
            }
            return answer;
        }
    }

}
