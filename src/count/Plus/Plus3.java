package count.Plus;

public class Plus3 {
    class Solution {
        public int solution(int[] number, boolean[] signs) {
            // 이 정수들의 절댓값을 차례대로 담은 정수 배열 absolutes와
            // 이 정수들의 부호를 차례대로 담은 불리언 배열 signs가 매개변수로 주어집니다.
            // 실제 정수들의 합을 구하여 return

            int answer = 0; // 정수들의 합을 저장할 변수를 초기화

            // 배열의 길이만큼 반복
            for (int i = 0; i < number.length; i++) {
                // signs[i] 값에 따라서 absolutes[i]를 더하거나 빼줌
                if (signs[i]) {
                    // true면 양수
                    answer += number[i];
                } else {
                    // false면 음수
                    answer -= number[i];
                }
            }

            return answer; // 최종적인 합을 반환
        }
    }

}
