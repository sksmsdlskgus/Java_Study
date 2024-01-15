package count.Plus;

public class Plus3 {
    class Solution {
        public int solution(int[] absolutes, boolean[] signs) {
            //이 정수들의 절댓값을 차례대로 담은 정수 배열 absolutes와
            //이 정수들의 부호를 차례대로 담은 불리언 배열 signs가 매개변수
            //실제 정수들의 합을 구하여 return
            //signs 참 = absolute 양수
            //signs 참X = absolute 음수
            int answer = 0;
            for (int i=0; i<absolutes.length; i++){
                if (signs[i]){
                    answer+=absolutes[i];
                }
                else {answer-=absolutes[i];
                }
            }
            return answer;
        }
    }

}
