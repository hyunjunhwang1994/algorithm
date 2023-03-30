package org.date230330;


import java.util.ArrayList;
import java.util.List;

/*
23.03.30 프로그래머스 모음사전, LV2, 완전탐색
https://school.programmers.co.kr/learn/courses/30/lessons/84512
*/
class Solution {
    List<String> list;
    String[] alphabet = {"A", "E", "I", "O", "U"};

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution("A"));
    }

    public int solution(String word) {
        int answer;
        list = new ArrayList<>();

        dfs("");

        answer = list.indexOf(word);

        return answer;
    }

    private void dfs(String str) {
        list.add(str);

        if (str.length() >= alphabet.length) {
            return;
        }

        for (String alphabet : alphabet) {
            dfs(str + alphabet);
        }

    }

}
