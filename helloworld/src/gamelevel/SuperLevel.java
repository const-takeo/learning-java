package gamelevel;

public class SuperLevel extends PlayerLevel {

    @Override
    public void run() {
        System.out.println("めっちゃ早く走ります");

    }

    @Override
    public void jump() {
        System.out.println("めっちゃ高くJumpします");

    }

    @Override
    public void trun() {
        System.out.println("めっちゃTurn出来ます");

    }

    @Override
    public void showLevelMessage() {
        System.out.println("マスターレベルです");
    }
}
