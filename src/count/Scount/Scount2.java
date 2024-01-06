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
}
