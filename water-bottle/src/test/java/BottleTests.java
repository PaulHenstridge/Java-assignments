import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BottleTests {

    Bottle myBottle;

    @Before
    public void before(){
        myBottle = new Bottle(100);
    }

    @Test
    public void canDrink(){
        myBottle.drink();
        assertEquals(90, myBottle.getVolume());
    }
}
