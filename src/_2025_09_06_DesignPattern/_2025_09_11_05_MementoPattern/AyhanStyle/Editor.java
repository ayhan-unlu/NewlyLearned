package _2025_09_06_DesignPattern._2025_09_11_05_MementoPattern.AyhanStyle;

//Class is called as Originator class in GoF book
public class Editor {
    String content;

    public static void main(String[] args) {
        History history = new History();
        EditorState currentState;
        currentState = createState("a");
        history.push(currentState);
        currentState = createState("b");
        history.push(currentState);
        currentState = createState("c");
        history.push(currentState);
        currentState = createState("d");
        history.push(currentState);
        EditorState lastState;
        lastState = history.pop();
        lastState = history.pop();
        lastState = history.pop();
        lastState = history.pop();
        System.out.println("State restored, last saved content is : "+restore(lastState));
    }

    public static EditorState createState(String content) {
        EditorState state = new EditorState(content);
        return state;
    }

    public static String restore(EditorState state) {
        return state.content;
    }


    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
