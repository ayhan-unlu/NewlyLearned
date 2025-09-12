package _2025_09_06_DesignPattern._2025_09_11_05_MementoPattern_PersonalSolution_Undo;

public class Main {

    public static void main(String[] args) {

        Editor editor = new Editor();

        editor.setContent("a");
        editor.setContent("b");
        editor.setContent("c");
        editor.undo();
        editor.undo();
        String lastAddedContent = editor.undo();
        System.out.println("Last Added content: " + lastAddedContent);
    }
}
