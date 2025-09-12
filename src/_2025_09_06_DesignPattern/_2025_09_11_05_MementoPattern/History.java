package _2025_09_06_DesignPattern._2025_09_11_05_MementoPattern;

import java.util.Stack;

//Class is called as CareTaker class in GoF book
public class History {
    Stack<EditorState> states = new Stack<>();

    public void push(EditorState state) {
        states.push(state);
    }

    public EditorState pop(){
        return states.pop();
    }

}
