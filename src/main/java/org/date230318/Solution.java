package org.date230318;


/*
23.03.18 프로그래머스 카드 뭉치, LV1, Practice
https://school.programmers.co.kr/learn/courses/30/lessons/159994?language=java
*/
class Solution {

    public static void main(String[] args) {
        String[] cards1 = {"i", "drink", "water"};
        String[] cards2 = {"want", "to"};
        String[] goal = {"i", "want", "to", "drink", "water"};

        Solution solution = new Solution();
        System.out.println(solution.solution(cards1, cards2, goal));

    }


    public String solution(String[] cards1, String[] cards2, String[] goal) {

        String answer = "Yes";
        /*ex :
        * cards1 : i drink water
        * cards2 : want to
        * goal: i want to drink water*/

        int one = 0;
        int two = 0;

        int i = 0;
        while (i < goal.length) {

            if (one < cards1.length && goal[i].equals(cards1[one])) {
                one++;
            } else if (two < cards2.length && goal[i].equals(cards2[two])) {
                two++;
            } else {
                answer = "No";
                break;
            }
            i++;
        }


        return answer;

    }
}
