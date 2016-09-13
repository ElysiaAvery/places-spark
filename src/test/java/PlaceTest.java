import org.junit.*;
import static org.junit.Assert.*;

public class PlaceTest {

  @Test
  public void Places_instantiatesNewPlace_true() {
    Place myPlace = new Place("Auckland");
    assertTrue(myPlace instanceof Places);
  }

  @Test
  public void Places_addsDescription() {
    Place myPlace = new Place("Auckland");
    assertEquals("Auckland", myPlace.getDescription());
  }
}
