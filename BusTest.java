import static org.junit.Assert.assertEquals;
import org.junit.*;

public class BusTest{
Bus bus;
Passenger person;

@Before
public void before(){
bus = new Bus("bus19");
person = new Passenger();
}

@Test
public void hasName(){
  assertEquals("bus19", bus.getName());
}

@Test
public void canLoadPassengers(){
   bus.load(person);
  assertEquals(1, bus.count_passengers());
}












}