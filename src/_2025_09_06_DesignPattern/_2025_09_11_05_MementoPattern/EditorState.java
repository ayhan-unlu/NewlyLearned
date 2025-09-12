package _2025_09_06_DesignPattern._2025_09_11_05_MementoPattern;

//Class is called as Memento class in GoF book
public class EditorState {
    String content;

    public EditorState() {
    }

    public EditorState(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

}
