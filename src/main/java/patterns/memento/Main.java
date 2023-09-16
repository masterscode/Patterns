package patterns.memento;

public class Main {
    public static void main(String[] args) {
        Editor editor = new Editor();
        History history = new History();

        editor.setContent("header");

        editor.setFontSize("12");
        editor.setFontName("SF Mono");
        history.push(editor.createState());
        editor.setContent("new line");
        editor.setFontName("Fira code");
        history.push(editor.createState());
        editor.setContent("last line");
        editor.setFontSize("25");

        history.push(editor.createState());

        

    }
}
