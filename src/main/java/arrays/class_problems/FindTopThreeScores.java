package arrays.class_problems;

import java.util.Arrays;

public class FindTopThreeScores {

    static int[] findTopThreeScores(int[] scores) {
        return new int[3];
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(findTopThreeScores(new int[]{45, 82, 79, 90, 33, 90, 61})));
    }
}
