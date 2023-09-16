package patterns.memento;


import lombok.Data;

@Data
public class EditorState {
    private String content;
    private String fontName;
    private String fontSize;

    public EditorState(String content, String fontName, String fontSize){
        this.content = content;
        this.fontName = fontName;
        this.fontSize = fontSize;
    }



}
