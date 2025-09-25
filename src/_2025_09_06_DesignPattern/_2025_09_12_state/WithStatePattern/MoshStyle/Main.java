package _2025_09_06_DesignPattern._2025_09_12_state.WithStatePattern.MoshStyle;

public class Main {
    public static void main(String[] args) {
        Canvas canvas = new Canvas();
        canvas.setCurrentTool(new SelectionTool());
        canvas.mouseDown();
        canvas.mouseUp();
        System.out.println();

        canvas.setCurrentTool(new BrushTool());
        canvas.mouseDown();
        canvas.mouseUp();
        System.out.println();
        canvas.setCurrentTool(new NewTool());
        canvas.mouseDown();
        canvas.mouseUp();
    }
}
