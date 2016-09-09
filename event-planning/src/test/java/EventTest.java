import org.junit.*;
import static org.junit.Assert.*;

public class EventTest {

  @Test
  public void planEvent_countUpToOne_ArrayList() {
    PingPong testPingPong = new PingPong();
    List<Object> expectedOutput = new ArrayList<Object>();
    expectedOutput.add(1);
    assertEquals(expectedOutput, testPingPong.runPingPong(1));
  }
}
