package patterns.state;

public class Canvas {
    private  Tool tool;

    public Canvas(){}
    public Canvas(Tool tool){
        this.tool = tool;
    }
    public void mouseDown(){
        tool.mouseDown();
    }

    public void mouseUp(){
        tool.mouseUp();
    }

    public Tool currentTool(){
        return tool;
    }

    public void setTool(Tool tool){
        this.tool = tool;
    }
}
