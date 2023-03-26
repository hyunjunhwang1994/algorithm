package org.date230326;


import java.util.Arrays;

/*
23.03.26 프로그래머스 테이블 해시 함수, LV2, Practice
https://school.programmers.co.kr/learn/courses/30/lessons/147354
*/
class Solution {

    public static void main(String[] args) {

        int[][] data = {{2,2,6},{1,5,10},{4,2,9},{3,8,3}};
        int col = 2;
        int row_begin = 2;
        int row_end = 3;



        Solution solution = new Solution();

        System.out.println(solution.solution(data, col, row_begin, row_end));

    }


    public int solution(int[][] data, int col, int row_begin, int row_end) {
        int answer = 0;
        col -= 1;
        row_begin -= 1;

        // 2. 정렬
        int finalCol = col;
        Arrays.sort(data, (o1, o2) -> {
            if (o1[finalCol] == o2[finalCol]) return o2[0] - o1[0];
            return o1[finalCol] - o2[finalCol];
        });

        // 3. S_i 합 구하기
        for (int i = row_begin; i < row_end; i++) {

            int finalI = i + 1;
            int dataTotal = Arrays.stream(data[i])
                    .map(j -> j % finalI)
                    .sum();

            // 4. XOR한 값 저장
            answer = (answer ^ dataTotal);
        }

        return answer;
    }
}
