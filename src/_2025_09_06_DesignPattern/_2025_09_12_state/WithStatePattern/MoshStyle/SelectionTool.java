package _2025_09_06_DesignPattern._2025_09_12_state.WithStatePattern.MoshStyle;

public class SelectionTool implements Tool{

    @Override
    public void mouseDown(){
        System.out.println("Selection icon is active");
    }

    @Override
    public void mouseUp(){
        System.out.println("Draw dashed rectangle");
    }
}
