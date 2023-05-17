import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class PrinterTests {

    Printer myPrinter;

    @Before
    public void before(){
        myPrinter = new Printer(100, 100);
    }

    @Test
    public void canPrint() {
        myPrinter.print(10,5);
        assertEquals(50, myPrinter.getPaper());
    }
}
