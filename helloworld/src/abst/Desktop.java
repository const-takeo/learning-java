package abst;

public class Desktop extends Computer {

    @Override
    public void display() {
        System.out.println("Desktop display");
    }

    @Override
    public void keyboard() {
        System.out.println("Desktop keyboard");
    }

    public void desktopMannual(){
        System.out.println("dada");
    }

}
