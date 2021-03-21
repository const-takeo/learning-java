package gamelevel;

public class BeginnerLevel extends PlayerLevel {

    @Override
    public void run() {
        System.out.println("ゆっくり走ります");

    }

    @Override
    public void jump() {
        System.out.println("jump出来ません");

    }

    @Override
    public void trun() {
        System.out.println("turn出来ません");

    }

    @Override
    public void showLevelMessage() {
        System.out.println("素人です");

    }

}
