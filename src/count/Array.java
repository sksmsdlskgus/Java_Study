package count;

import java.util.ArrayList;

public class Array {
    public static int[] reverseDigits(int n) {
        // 결과를 저장할 ArrayList를 생성합니다.
        ArrayList<Integer> reversedList = new ArrayList<>();

        // 주어진 자연수 n을 뒤집어서 reversedList에 추가합니다.
        while (n > 0) {
            int digit = n % 10; // 현재 자릿수를 구합니다.
            reversedList.add(digit); // 배열에 자릿수를 추가합니다.
            n /= 10; // 다음 자릿수를 확인하기 위해 n을 10으로 나눕니다.
        }

        // ArrayList를 int 배열로 변환합니다.
        int[] result = new int[reversedList.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = reversedList.get(i);
        }

        return result;
    }

    public static void main(String[] args) {
        int n = 12345;
        int[] reversedArray = reverseDigits(n);

        // 결과를 출력합니다.
        System.out.print("Reversed Digits: ");
        for (int digit : reversedArray) {
            System.out.print(digit + " ");
        }
    }
}
