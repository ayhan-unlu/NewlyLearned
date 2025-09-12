package _2025_09_06_DesignPattern._2025_09_12_state.WithStatePattern.AyhanStyle;

//Class is called as ConcreteStateA class in GoF book
public class Selection extends Canvas {
    @Override
    public void mouseDown() {
        System.out.println("Selection icon active");
    }

    @Override
    public void mouseUp() {
        System.out.println("Draw dashed rectangle");
    }
}
