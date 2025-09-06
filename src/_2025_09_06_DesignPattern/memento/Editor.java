package _2025_09_06_DesignPattern.memento;

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

    public void undo(){
        if(!addedContents.isEmpty()){
            content = addedContents.pop();
            System.out.println("Last Added content: "+ content);
        }
    }

}
