package _2025_09_06_DesignPattern._2025_09_12_state.NoStatePattern;

public class Canvas {

    private ToolType currentTool;




    public void mouseDown() {

        if (currentTool == ToolType.SELECTION) {
            System.out.println("Selection Icon is Active");
        }else if(currentTool== ToolType.BRUSH){
            System.out.println("Brush Icon is Active");
        }else if(currentTool== ToolType.ERASER){
            System.out.println("Eraser Icon is Active");
        }

    }

    public void mouseUp() {
          if(currentTool == ToolType.SELECTION){
              System.out.println("Draw dashed rectangle");
          }else if(currentTool== ToolType.BRUSH){
              System.out.println("Draw a brush line");
          }else if(currentTool== ToolType.ERASER){
              System.out.println("Erase brush line");
          }

    }

    public ToolType getCurrentTool() {
        return currentTool;
    }

    public void setCurrentTool(ToolType currentTool) {
        this.currentTool = currentTool;
    }
}
