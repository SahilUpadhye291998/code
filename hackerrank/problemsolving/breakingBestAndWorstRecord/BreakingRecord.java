package hackerrank.problemsolving.breakingBestAndWorstRecord;

class BreakingRecord {
    public static void main(String[] args) {
        int[] score = new int[] { 3, 4, 21, 36, 10, 28, 35, 5, 24, 42 };
        int maxScore = score[0];
        int minScore = score[0];
        int maxScoreCounter = 0;
        int minScoreCounter = 0;

        for (int i = 0; i < score.length; ++i) {
            if (score[i] < minScore) {
                minScore = score[i];
                minScoreCounter++;

            } else if (score[i] > maxScore) {
                maxScore = score[i];
                maxScoreCounter++;
            }
        }
        System.out.println(minScoreCounter + " " + maxScoreCounter);
    }
}