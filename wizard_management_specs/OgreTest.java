import static org.junit.Assert.*;
import org.junit.*;
import wizard_management.*;

public class OgreTest {

  Ogre ogre;

  @Before
  public void before() {
    ogre = new Ogre("Freddie");
  }

  @Test
  public void hasName() {
    assertEquals("Freddie", ogre.getName());
  }

  @Test
  public void canProtect() {
    assertEquals(ogre.protect(), "A fierce ogre protects you!");
  }

}