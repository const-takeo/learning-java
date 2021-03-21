package scheduler;

public class RoundRobin implements Scheduler {

    @Override
    public void getNextCall() {
        System.out.println("待機列から順番に持ってくる");

    }

    @Override
    public void sendCallToAgent() {
        System.out.println("次の順番に回します");

    }

}
