package _2025_09_06_DesignPattern._2025_09_12_state.WithStatePattern.MoshStyle;

public class NewTool implements Tool{

    @Override
    public void mouseDown() {
        System.out.println("New Tool icon is active");
    }

    @Override
    public void mouseUp() {
        System.out.println("New Tool is drawing circle");
    }
}
