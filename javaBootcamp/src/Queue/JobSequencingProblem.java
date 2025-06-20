package Queue;

import java.util.*;

public class JobSequencingProblem {

    static class Job {
        String jobId;
        int deadLine;
        int profit;

        Job(String jobId, int deadLine, int profit) {
            this.jobId = jobId;
            this.deadLine = deadLine;
            this.profit = profit;
        }
    }

    public static void main(String[] args) {
        Job[] jobs = {
                new Job("a", 4, 20),
                new Job("b", 1, 10),
                new Job("c", 1, 40),
                new Job("d", 1, 30)
        };


    }
}
