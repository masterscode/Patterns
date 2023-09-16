package patterns.memento;

import java.util.Stack;

public class History {
    private final  Stack<EditorState> editorStates = new Stack<>();

    public void push(EditorState state){
        editorStates.push(state);
    }

    public EditorState pop(){
        return editorStates.pop();
    }
}
