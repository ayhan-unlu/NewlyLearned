package _2025_09_06_DesignPattern._2025_09_11_05_MementoPattern.MoshStyle;

public class Main {
    public static void main(String[] args) {
        Editor editor = new Editor();
        History history = new History();

        editor.setContent("a");
        history.push(editor.createState());

        editor.setContent("b");
        history.push(editor.createState());

        editor.setContent("c");
        System.out.println("No undo: "+editor.getContent());
        editor.restore(history.pop());

        System.out.println("First undo: "+editor.getContent());

        editor.restore(history.pop());
        System.out.println("Second undo: "+editor.getContent());
    }
}
