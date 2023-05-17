import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BearTest {
    Bear bear;
    @Before
    public void before(){
        bear = new Bear ("Baloo", 25, 100);
    }

    @Test
    public void hasName() {
        assertEquals("Baloo", bear.getName());
    }

    @Test
    public void hasAge(){
        assertEquals(25,bear.getAge());
    }

    @Test
    public void hasWeight(){
    assertEquals(100, bear.getWeight(),0.0);
    }

    @Test
    public void readyToHibernate() {
        assertEquals(true, bear.readyToHibernate());
    }

    @Test
    public void notReadyToHibernate() {
        Bear skinnyBear = new Bear("Bob", 12, 22);
        assertEquals(false, skinnyBear.readyToHibernate());

    }
}

