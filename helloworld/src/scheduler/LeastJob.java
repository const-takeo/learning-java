package scheduler;

public class LeastJob implements Scheduler {

    @Override
    public void getNextCall() {
        System.out.println("待機列から順番に持ってくる");

    }

    @Override
    public void sendCallToAgent() {
        System.out.println("暇の所に配ります");

    }

}
