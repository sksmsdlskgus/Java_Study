package count.Plus;

public class Plus4 {
    class Solution {
        public int solution(int num) {
            // 주어진 수가 1이 될 때까지 반복
            // 1-1. 입력된 수가 짝수라면 2로 나눕니다.
            // 1-2. 입력된 수가 홀수라면 3을 곱하고 1을 더합니다.
            // 2. 결과로 나온 수에 같은 작업을 1이 될 때까지 반복합니다.
            // 단, 주어진 수가 1인 경우에는 0을 반환
            // 작업을 500번 반복할 때까지 1이 되지 않는다면 –1을 반환
            int answer = 0;

            while (num != 1) {
                if (num % 2 == 0) {
                    // 1-1. 입력된 수가 짝수인 경우
                    num = num / 2;
                } else if(num % 2 == 1) {
                    // 1-2. 입력된 수가 홀수인 경우
                    num = num * 3 + 1;
                }

                answer++;// 반복 횟수를 세기 위해 answer를 1 증가시킵니다.

                if(answer>=500){
                    answer=-1;
                    break;
                }

            }
            return answer;

        }
    }


}
