package count;

public class Square {

    class Solution {
        public long solution(long n) {
            //n이 어떤양의 정수 x의 제곱인지 아닌지 판단목적
            //n이 양의정수 x의 제곱이라면 ? x+1 제곱 리턴
            //n이 양의정수 x의 제곱이 아니라면? -1 리턴
            long i =0;
            while(i*i<=n){
                if(i*i==n){
                    return (i+1)*(i+1);
                }
                i++;
                // 주의 i++안하면 ?
                // i의 값이 항상 1로 유지되어 무한 루프에 빠지게 됨
                // 루프의 종료 조건이 항상 참이 되어 루프가 종료되지 않음
            }
            return -1;
        }
    }

    class Solution2 {
        public long solution2(long n) {
            long i = 0;
            while(i*i<=n)
                if(++i*i == n) return n+2*i+1;
            return -1;
        }
    }
}
