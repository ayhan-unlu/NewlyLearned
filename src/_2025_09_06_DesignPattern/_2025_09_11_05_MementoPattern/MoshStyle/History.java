package _2025_09_06_DesignPattern._2025_09_11_05_MementoPattern.MoshStyle;

import java.util.ArrayList;
import java.util.List;

public class History {
    private List<EditorState> states = new ArrayList<>();

    public void push(EditorState state) {
        states.add(state);
    }

    public EditorState pop() {
        int lastIndex = states.size() - 1;
        EditorState lastState = states.get(lastIndex);
        states.remove(lastIndex);
        return lastState;
    }
}
