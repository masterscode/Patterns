package patterns.memento;

import lombok.Data;

@Data
public class Editor {
    private String content;
    private String fontName;
    private String fontSize;

    public EditorState createState() {
        return new EditorState(content, fontName, fontSize);
    }

    public void restore(EditorState state) {
        content = state.getContent();
        fontName = state.getFontName();
        fontSize = state.getFontSize();
    }

}
