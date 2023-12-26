import java.util.Arrays;

public class CombinedSimulation {
    public static void main(String[] args) {
        char[][] charArray = {
                {'A', 'B', 'C'},
                {'D', 'E', 'F'},
                {'G', 'H', 'I'}
        };

        // 2차원 배열을 행(row) 단위로 순회
        for (char[] row : charArray) {
            // 각 행을 열(column) 단위로 순회하여 출력
            for (char element : row) {
                System.out.print(element + " ");
            }
            System.out.println();  // 행을 출력한 후 개행
        }
    }
}

