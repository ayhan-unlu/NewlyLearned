package _2025_09_06_DesignPattern._2025_09_12_state.WithStatePattern.AyhanStyle;

public class Main {
    public static void main(String[] args) {
        mouseDown(new Brush());
        mouseUp(new Brush());
        System.out.println();

        mouseDown(new Eraser());
        mouseUp(new Eraser());
        System.out.println();

        mouseDown(new Selection());
        mouseUp(new Selection());
    }

    public static void mouseUp(Canvas canvas) {
        canvas.mouseUp();
    }

    public static void mouseDown(Canvas canvas) {
        canvas.mouseDown();
    }
}
