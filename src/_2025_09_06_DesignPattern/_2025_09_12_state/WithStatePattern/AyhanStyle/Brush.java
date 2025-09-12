package _2025_09_06_DesignPattern._2025_09_12_state.WithStatePattern.AyhanStyle;

//Class is called as ConcreteStateB class in GoF book
public class Brush extends Canvas {
    @Override
    public void mouseDown() {
        System.out.println("Brush icon is active");
    }

    @Override
    public void mouseUp() {
        System.out.println("Draw a brush line");
    }
}
