public class Christmas {
        public static void main(String[] args) {
            int n = 5;  // 트리의 높이를 나타내는 변수

            // 외부 반복문: 트리의 높이 만큼 반복
            for (int i = 0; i < n; i++) {
                // 내부 반복문: 공백 출력
                for (int j = 0; j < n - i - 1; j++) {
                    System.out.print(" ");
                }

                // 내부 반복문: 별표 출력
                for (int k = 0; k < 2 * i + 1; k++) {
                    System.out.print("*");
                }

                // 행 변경
                System.out.println();
            }

            // 트리의 기둥 출력
            for (int i = 0; i < n - 1; i++) {
                System.out.print(" ");
            }
            System.out.println("|");
            System.out.println("\nMerry Christmas ❤️");
        }

    }

