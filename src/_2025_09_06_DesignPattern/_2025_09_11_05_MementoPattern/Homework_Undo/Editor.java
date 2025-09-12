package _2025_09_06_DesignPattern._2025_09_11_05_MementoPattern.Homework_Undo;

import java.util.Stack;

public class Editor {

    private String content;
    private Stack<String> addedContents = new Stack<>();

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
        addedContents.push(content);
    }

    public String undo(){
        if(!addedContents.isEmpty()){
            content = addedContents.pop();
        }
        return content;
    }

}
