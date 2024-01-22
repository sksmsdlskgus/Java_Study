package count.array;

import java.util.Arrays;

public class Array3 {
    class Solution {
        public int[] solution(int[] arr, int divisor) {
            // array각 요소중 divisor로 나누어 떨어지는 값을 오름차순으로 정렬한 배열 반환
            //divisor로 나누어 떨어지는 요소가 없다면 배열에 -1을 담아 반환
            int[] answer = {};
            return answer;
        }
    }

    class Solution2 {
        public int[] solution2(int[] arr, int divisor) {
            int[] answer ={-1};
            int count = 0;

            for(int i = 0; i < arr.length; i++){
                if(arr[i] % divisor == 0){
                    count++;
                }
            }

            if(count >= 1){
                answer = new int[count];
            }

            for(int i = 0; i < arr.length; i++){
                if(arr[i] % divisor == 0){
                    answer[count-1] = arr[i];
                    count--;
                }
                if(count == 0){
                    break;
                }
            }

            Arrays.sort(answer);

            return answer;
        }
    }
}
