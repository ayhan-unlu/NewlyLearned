package _2025_09_06_DesignPattern._2025_09_12_state.WithStatePattern.AyhanStyle;

public class Eraser extends Canvas {
    @Override
    public void mouseDown() {
        System.out.println("Eraser icon is active");
    }

    @Override
    public void mouseUp() {
        System.out.println("Erase the brush line");
    }
}
