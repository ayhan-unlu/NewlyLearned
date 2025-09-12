package _2025_09_06_DesignPattern._2025_09_11_05_MementoPattern.MoshStyle;

public class Editor {
    private String content;


    public EditorState createState(){
/*
        EditorState state = new EditorState(content);
        return state;
*/
        return new EditorState(content);
    }

    public void restore(EditorState state){
        content = state.getContent();
    }
    public String getContent(){
        return content;
    }

    public void setContent(String content){
        this.content =content;
    }
}
