class Solution {
    public String[] findRelativeRanks(int[] score) {

        PriorityQueue<Integer> maxheap =
            new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < score.length; i++) {
            maxheap.add(score[i]);
        }
        String[] answer = new String[score.length];
        int rank = 1;
        while (!maxheap.isEmpty()) {
            int value = maxheap.poll();
            for (int i = 0; i < score.length; i++) {
                if (score[i] == value) {
                    if (rank == 1)
                        answer[i] = "Gold Medal";
                    else if (rank == 2)
                        answer[i] = "Silver Medal";
                    else if (rank == 3)
                        answer[i] = "Bronze Medal";
                    else
                        answer[i] = String.valueOf(rank);
                    break;
                }
            }
            rank++;
        }

        return answer;
    }
}