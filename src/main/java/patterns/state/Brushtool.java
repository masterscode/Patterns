package patterns.state;


import lombok.extern.java.Log;

@Log
public class Brushtool implements Tool {
    @Override
    public void mouseDown() {
        log.info("Brush tool mouse down");
    }

    @Override
    public void mouseUp() {
        log.info("Brush tool mouse up");
    }
}
