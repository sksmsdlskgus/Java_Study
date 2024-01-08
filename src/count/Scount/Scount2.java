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
