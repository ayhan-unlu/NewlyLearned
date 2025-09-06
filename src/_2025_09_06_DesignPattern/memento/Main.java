package _2025_09_06_DesignPattern.memento;

public class Main {

    public static void main(String[] args) {

        var editor = new Editor();

        editor.setContent("a");
        editor.setContent("b");
        editor.setContent("c");
        editor.undo();
        editor.undo();
        editor.undo();
    }
}
