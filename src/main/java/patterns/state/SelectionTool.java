package patterns.state;


import lombok.extern.java.Log;

@Log
public class SelectionTool implements Tool{
    @Override
    public void mouseDown() {
        log.info("--> Selection tool mouse down");
    }

    @Override
    public void mouseUp() {
        log.info("--> Selection tool mouse up");
    }
}
