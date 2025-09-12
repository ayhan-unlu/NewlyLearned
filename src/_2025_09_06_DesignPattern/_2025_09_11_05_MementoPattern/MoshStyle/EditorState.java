package _2025_09_06_DesignPattern._2025_09_11_05_MementoPattern.MoshStyle;

public class EditorState {
    public String getContent() {
        return content;
    }

    private final String content;

    public EditorState(String content) {
        this.content = content;
    }

}
