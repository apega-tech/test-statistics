package com.pluralsight;

import java.util.Arrays;

public class TestStatistics {
    public static void main(String[] args) {
        int[] scores = {85, 92, 78, 90, 88, 76, 95, 89, 82, 91};

        Arrays.sort(scores);

        int sum = 0;
        int lowest = scores[0];
        int highest = scores[scores.length - 1];

        for (int score : scores) {
            sum += score;
        }

        double average = (double) sum / scores.length;

        double median = (scores[4] + scores[5]) / 2.0;
        double difference = Math.abs(average - median);

        System.out.println("--- Test Statistics Report ---");
        System.out.println("Scores (Sorted): " + Arrays.toString(scores));
        System.out.println("Lowest Score: " + lowest);
        System.out.println("Highest Score: " + highest);
        System.out.println("Average Score: " + average);
        System.out.println("Median Score: " + median);
        System.out.println("Difference between Average and Median: " + difference);
    }
}