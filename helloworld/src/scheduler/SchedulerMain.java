package scheduler;

import java.io.IOException;

public class SchedulerMain {
    public static void main(String[] args) throws IOException {
        // R , L, P
        System.out.println("選択肢から選択しなさい");
        int ch = System.in.read();
        Scheduler scheduler = null;
        if (ch == 'R' || ch == 'r') {
            scheduler = new RoundRobin();
        } else if (ch == 'L' || ch == 'l') {
            scheduler = new LeastJob();
        } else if (ch == 'P' || ch == 'p') {
            scheduler = new PriorityAllocation();
        } else {
            System.out.println("エラーです");
            return;
        }
        //polymorphism
        scheduler.getNextCall();
        scheduler.sendCallToAgent();
    }
}
