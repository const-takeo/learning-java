package gamelevel;

public class AdvancedLevel extends PlayerLevel {

    @Override
    public void run() {
        System.out.println("早く走ります");

    }

    @Override
    public void jump() {
        System.out.println("高くjumpします");

    }

    @Override
    public void trun() {
        System.out.println("turn出来ません");

    }

    @Override
    public void showLevelMessage() {
        System.out.println("ミドルレベルです");

    }

}
