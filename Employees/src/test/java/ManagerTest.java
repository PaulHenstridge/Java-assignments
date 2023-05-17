import management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    private Manager manager;

    @Before
    public void before() {
        manager = new Manager("John Dope", 123456789, 50000, "IT");
    }

    @Test
    public void canGetName() {
        assertEquals("John Dope", manager.getName());
    }

    @Test
    public void canGetNiNum() {
        assertEquals(123456789, manager.getNiNum());
    }

    @Test
    public void canGetSalary() {
        assertEquals(50000, manager.getSalary());
    }

    @Test
    public void canGetDeptName() {
        assertEquals("IT", manager.getDeptName());
    }

    @Test
    public void canRaiseSalary() {
        manager.raiseSalary(5000);
        assertEquals(55000, manager.getSalary());
    }

    @Test
    public void canPayBonus() {
        assertEquals(500, manager.payBonus(), 0.01);
    }
}
