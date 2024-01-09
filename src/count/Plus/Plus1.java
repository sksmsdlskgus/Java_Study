package count.Plus;

public class Plus1 {
    public class Solution { // 각 자릿수 합
        public int solution(int n) {
            int answer = 0;
            while (n != 0) {
                answer += n % 10;
                n /= 10;
            }

            return answer;
        }
    }

    public class Solution2 {
        public int solution(int n) {
            // 정수를 문자열로 변환하여 각 자리의 문자에 대한 스트림을 얻음
            return String.valueOf(n)
                    .chars()
                    // 각 문자를 숫자로 변환하여 매핑
                    .map(Character::getNumericValue)
                    // 숫자들의 합을 계산
                    .sum();
        }
    }
}
