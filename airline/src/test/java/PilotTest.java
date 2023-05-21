import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {

    Pilot pilot1;
    Pilot pilot2;

    @Before
    public void before(){
        pilot1 = new Pilot("Steve Flyman", "Commander", "3847574945XQ");
        pilot2 = new Pilot("Dave Crashman", "Baggage handler");
    }
    @Test
    public void legitPilot(){
        assertEquals("Let's Fly!", pilot1.checkLicence());

    };
    @Test
    public void fakePilot(){
        assertEquals("I don't know how to fly this thing!", pilot2.checkLicence());

    };

}

