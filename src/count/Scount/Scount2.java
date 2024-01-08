package count.Scount;

public class Scount2 {
    class Solution {
        public boolean solution(int x) {
            // 양의정수 x > 하샤드 수 이려면?
            // x의 자릿수의 합으로 x가 나눠져야함
            boolean answer = true;
            int result = 0;

            while(x!=0){
                result += x%10;
                x/=10;
            }

            if (x/result!=0){answer=false;}
            return answer;
        }
    }


    class Solution1 {
        public boolean solution1(int x) {
            boolean answer = true;
            int result = 0;

            // x의 각 자릿수의 합을 구함
            int originalX = x;  // x의 원본 값을 보존하기 위한 변수 주의 !!!
            //  while 루프에서 x를 10으로 나누어가며 각 자릿수의 합을 계산할 때,
            //  x가 0이 되기 전까지 루프가 돌게 됨
            // 그리고 나서 if (originalX % result != 0)에서 원본 값인 originalX를 사용하여
            //  하샤드 수 여부를 판단
            // 만약 x의 값을 계속해서 나누어가면,
            // x의 값이 0이 되어 루프를 빠져나오면서 originalX도 0이 되어버리게 됨
            while(x != 0) {
                result += x % 10;
                x /= 10;
            }

            // x의 각 자릿수의 합으로 x가 나눠져야함
            if (originalX % result != 0) {
                answer = false;
            }

            return answer;
        }
    }


    class Solution2 {
        public boolean solution2(int x) {
            boolean answer = true;
            int a = x;
            int hap = 0;
            while(x != 0){
                hap += x%10;
                x /=10;
            }
            answer = (a%hap==0) ? true : false ;
            return answer;
        }
    }

}
