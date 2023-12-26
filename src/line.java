public class line {
    public static int countLines(int[][] lines) {
        //1. arr 배열 및 변수 초기화
        //2. lines 정보를 arr 배열에 적용
        //3. arr 배열에서 겹친 부분 세기
        int answer = 0;
        int[] arr = new int[200];

        for (int i = 0; i < lines.length; i++)
            for (int j = lines[i][0] + 100; j < lines[i][1] + 100; j++)
                arr[j]++;

        for (int i = 0; i < 200; i++)
            if (arr[i] > 1)
                answer++;
        return answer;
    }

    public static void main(String[] args) {
        // 예제 입력
        int[][] lines = {{-50, 30}, {-10, 20}, {10, 50}};

        // 메서드 호출 및 결과 출력
        int result = countLines(lines);
        System.out.println("Overlapping lines count: " + result);
    }
}
