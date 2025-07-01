package Queue;

import java.util.*;

public class JobSequencingProblem {

    static class Job {
        int jobId;
        int deadLine;
        int profit;

        Job(int jobId, int deadLine, int profit) {
            this.jobId = jobId;
            this.deadLine = deadLine;
            this.profit = profit;
        }
    }

    public static void main(String[] args) {
        int[][] jobInfo = {
                {4,20},
                {1,30},
                {1,40},
                {1,10},
        };
        ArrayList<Job> jobs = new ArrayList<>();
        for (int i = 0; i <jobInfo.length ; i++) {
            jobs.add(i, new Job(i, jobInfo[i][0], jobInfo[i][1]));
        }
        
        //descending order of profit 
        Collections.sort(jobs,(obj1,obj2)-> obj2.profit-obj1.profit);

        ArrayList<Integer> sequence = new ArrayList<>();
        int time = 0;
        for (int i = 0; i <jobs.size() ; i++) {
            Job curr = jobs.get(i);
            if (curr.deadLine > time) {
                sequence.add(curr.jobId);
                time++;
            }
        }
        System.out.println("max jobs = " + sequence.size());
        for (int i = 0; i <sequence.size() ; i++) {
            System.out.print(sequence.get(i) + " ");
        }
        System.out.println();
    }
}
