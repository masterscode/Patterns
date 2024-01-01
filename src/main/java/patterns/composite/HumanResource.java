package patterns.composite;


import lombok.extern.slf4j.Slf4j;

@Slf4j
public class HumanResource implements TeamResource{
  @Override
  public void deploy() {
    log.info("Deploying a human resource");
  }
}
