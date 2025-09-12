package _2025_09_06_DesignPattern._2025_09_12_state.WithStatePattern.MoshStyle;

public class BrushTool implements Tool{

    @Override
    public void mouseDown(){
        System.out.println("Brush icon is active");
    }

    @Override
    public void mouseUp(){
        System.out.println("Draw a brush line");
    }
}
