package count.Plus;

public class Plus2 {
    class Solution {
        public long solution(int a, int b) {
            // a와 b 사이에 있는 모든 정수의 합을 계산하여 반환합니다.
            // a와 b가 같은 경우에는 a 또는 b 중 아무 수나 반환합니다.

            // a와 b가 같은지 확인합니다.
            if (a == b) {
                return a; // 만약 같다면 a 또는 b 중 아무 수나 반환합니다.
            } else if (a > b) {
                // a가 b보다 큰 경우, 두 값을 교환합니다.
                int temp = a;
                a = b;
                b = temp;
            }

            // 등차수열 합 공식을 사용하여 a와 b 사이의 모든 정수의 합을 계산합니다.
            // (b - a + 1)은 정수의 개수를 계산하며, (a + b)는 첫 항과 끝 항의 합을 계산합니다.
            // (long)는 결과가 long 형식임을 보장하여 큰 값도 처리할 수 있습니다.
            return (long) (b - a + 1) * (a + b) / 2;
        }
    }
}
