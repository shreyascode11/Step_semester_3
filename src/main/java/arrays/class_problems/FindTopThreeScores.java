package arrays.class_problems;

import java.util.Arrays;

public class FindTopThreeScores {

    static int[] findTopThreeScores(int[] scores) {
        int first = 0;
        int second = 0;
        int third = 0;

        for (int i=0;i<scores.length;i++) {
            int score= scores[i];
            if (score >= first) {
                third = second;
                second = first;
                first = score;
            } else if (score >= second) {
                third = second;
                second = score;
            } else if (score >= third) {
                third = score;
            }
        }

        return new int[]{first, second, third};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(findTopThreeScores(new int[]{45, 82, 79, 90, 33, 90, 61})));
    }
}
