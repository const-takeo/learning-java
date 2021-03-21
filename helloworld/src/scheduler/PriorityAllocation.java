package scheduler;

public class PriorityAllocation implements Scheduler {

    @Override
    public void getNextCall() {
        System.out.println("グレードが高いクライアントから配ります");
    }

    @Override
    public void sendCallToAgent() {
        System.out.println("効率がいいスタフに配ります");
    }

}
