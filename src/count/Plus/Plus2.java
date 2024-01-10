package count.Plus;

public class Plus2 {
    class Solution {
        public long solution(int a, int b) {
            //  a와 b 사이에 속한 모든 정수의 합을 리턴
            // a와 b가 같을 경우에는 둘 중 아무 수나 리턴
            long answer = 0;
            // a랑 b랑 비교해서 큰거 작은거 비교..
            for (int i=a; i<b+1; i++){
                answer+=i;
            }
            return answer;
        }
    }

    class Solution2 {
        public long solution2(int a, int b) {
            // a와 b 사이에 속한 모든 정수의 합을 리턴
            // a와 b가 같을 경우에는 둘 중 아무 수나 리턴
            if (a == b) {
                return a; // Return either a or b if they are equal
            } else if (a > b) {
                int temp = a;
                a = b;
                b = temp;
            }

            return (long) (b - a + 1) * (a + b) / 2;
        }
    }

}
